from flask import Flask, jsonify, abort, make_response, request
from flask_sqlalchemy import SQLAlchemy

app = Flask(__name__)

app.config['SQLALCHEMY_DATABASE_URI'] = 'mysql+pymysql://lev:qwerty@localhost:3306/tdb'
db = SQLAlchemy(app)


class Part(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    price = db.Column(db.Integer)
    model = db.Column(db.String(45))
    brand = db.Column(db.String(45))
    color = db.Column("color2",db.String(45))


@app.route('/parts', methods=['GET'])
def get_parts():
    parts = []
    all_parts = Part.query.all()
    for pt in all_parts:
        part = {
            'price': pt.price,
            'model': pt.model,
            'brand': pt.brand,
            'color': pt.color
        }
        parts.append(part)
    db.session.commit()
    return jsonify({'parts': parts})


@app.route('/parts/<int:part_id>', methods = ['GET'])
def get_part(part_id):
    pt = Part.query.filter_by(id=part_id).first()
    part = {
        'price': pt.price,
        'model': pt.model,
        'brand': pt.brand,
        'color': pt.color,
    }
    db.session.commit()
    return jsonify({'part': part})


@app.errorhandler(404)
def not_found(error):
    return make_response(jsonify({'error': 'Not found'}), 404)


@app.route('/parts', methods=['POST'])
def add_part():
    if not request.json or not 'price' in request.json:
        abort(400)
    new_part = Part()
    new_part.id = request.json['id']
    new_part.price = request.json['price']
    new_part.model = request.json.get('model', "")
    new_part.brand = request.json.get('brand', "")
    new_part.color = request.json.get('color', "")

    db.session.add(new_part)
    db.session.commit()
    return jsonify('Successful')


@app.route('/parts/<int:part_id>', methods=['PUT'])
def update_part(part_id):
    part = Part.query.get(part_id)

    part.price = request.json['price']
    part.model = request.json['model']
    part.brand = request.json['brand']
    part.color = request.json['color']
    db.session.commit()
    return jsonify('Successful')


@app.route('/parts/<int:part_id>', methods=['DELETE'])
def delete_part(part_id):
    pt = Part.query.filter_by(id=part_id).first()
    db.session.delete(pt)
    db.session.commit()
    return jsonify({'result': True})


if __name__ == '__main__':
    app.run(debug=True)