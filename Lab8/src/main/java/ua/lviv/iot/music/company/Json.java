package ua.lviv.iot.music.company;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ua.lviv.iot.music.model.MusicalInstrument;
import ua.lviv.iot.music.persistence.dao.MusicalInstrumentDao;

@Path("/music")
public class Json {

    @Inject
    private MusicalInstrumentDao musicalInstrumentDao;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public MusicalInstrument getInstruments(@PathParam("id") Integer id) {
        return musicalInstrumentDao.findById(id);
    }

    @POST
    public Response createInstrument(MusicalInstrument musicalInstrument) {
    		musicalInstrumentDao.persist(musicalInstrument);
        return Response.status(200).entity("MusicalInstrument").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteInstrument(@PathParam(("id")) Integer id) {
        musicalInstrumentDao.delete(id);
        return Response.status(200).entity("MusicalInstrument").build();
    }

    @PUT
    @Path("{id}/")
    public Response updateInstrument(final @PathParam("id") Integer id, final MusicalInstrument musicalInstrument) {
    	 	musicalInstrument.setId(id);
    	 	musicalInstrumentDao.update(musicalInstrument);
        return Response.status(200).entity("MusicalInstrument").build();
    }
}
