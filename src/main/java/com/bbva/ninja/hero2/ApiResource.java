package com.bbva.ninja.hero2;

import com.bbva.ninja.hero2.beans.Hero;
import java.lang.String;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/api")
public interface ApiResource {
  @Path("/heroes")
  @GET
  @Produces("application/json")
  List<Hero> returnsAllTheHeroesFromTheDatabase();

  @Path("/heroes")
  @PUT
  @Produces("application/json")
  @Consumes("application/json")
  Hero updatesAnExitingHero(Hero data);

  @Path("/heroes")
  @POST
  @Produces("application/json")
  @Consumes("application/json")
  String createsAValidHero(Hero data);

  @Path("/heroes/hello")
  @GET
  @Produces("text/plain")
  String generatedMethod1();

  @Path("/heroes/random")
  @GET
  @Produces("application/json")
  Hero returnsARandomHero();

  @Path("/heroes/{id}")
  @GET
  @Produces("application/json")
  Hero returnsAHeroForAGivenIdentifier(@PathParam("id") long id);

  @Path("/heroes/{id}")
  @DELETE
  void deletesAnExitingHero(@PathParam("id") long id);

  @Path("/heroes/{nombre}")
  @GET
  void generatedMethod2(@PathParam("nombre") String nombre, @PathParam("nombre") String nombre);
}
