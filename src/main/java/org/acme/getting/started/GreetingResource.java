package org.acme.getting.started;

import model.ConcreteChild;
import model.ConcreteContainer;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

  @POST
  @Produces(MediaType.TEXT_PLAIN)
  public String hello(@RequestBody(description = "some description") ConcreteContainer container) {
    ConcreteChild myConcreteChild = container.getChild();
    return "Hello RESTEasy" + myConcreteChild.getNickname();
  }


  @GET
  public String testYasson() {
    ConcreteContainer concreteContainer = new ConcreteContainer();
    concreteContainer.setChild(new ConcreteChild());
    concreteContainer.getChild().setNickname("Nick");
    Jsonb jsonb = JsonbBuilder.create();
    jsonb.toJson(concreteContainer);
    ConcreteContainer roundtripContainer = jsonb.fromJson(jsonb.toJson(concreteContainer), ConcreteContainer.class);
    return roundtripContainer.getChild().getNickname();

  }
}