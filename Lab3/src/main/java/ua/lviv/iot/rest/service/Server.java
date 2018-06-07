package ua.lviv.iot.rest.service;
import ua.lviv.iot.model.Part;
import ua.lviv.iot.persistence.dao.PartDao;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;

@Path("/server")
@SessionScoped
public class Server implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private PartDao dao;
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Part getFruit(@PathParam("id") Integer id) {
        return dao.findById(id);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response createFruit(Part part) {
        dao.persist(part);
        return Response.ok().build();
    }

//    @DELETE
//    @Path("/{id}")
//    public  Response deleteFruit(@PathParam("id") Integer id) {
//        dao.delete(id);
//        return Response.status(200).entity("Good").build();
//    }
//
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON)
//    public  Response updateFruit(Fruit fruit) {
//        dao.updateObject( fruit);
//        return Response.status(200).entity("Good").build();
//    }

    @GET
    @Path("/size")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.TEXT_XML})
    public  String getSize() {
        return "Yes";
    }

}
