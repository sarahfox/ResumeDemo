package com.eldonfox.ResumeDemo.resources;

import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.eldonfox.ResumeDemo.api.Resume;

@Path("/resume")
@Produces(MediaType.APPLICATION_JSON)
public class ResumeResource {

	@GET
	@Timed
	public Resume getResume(@QueryParam("fileName") Optional<String> fileName) {
		Resume resume = new Resume();
		return resume;
	}
}
