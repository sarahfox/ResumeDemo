package com.w3foxes.sarah.ResumeDemo.resources;

import java.io.InputStream;
import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.w3foxes.sarah.ResumeDemo.api.Resume;

@Path("/resume")
@Produces(MediaType.APPLICATION_JSON)
public class ResumeResource2 {

	@GET
	@Timed
	public Resume getResume(@QueryParam("fileName") Optional<String> fileName) {
		final String resumeFileName = fileName.orElse("resumeData.json");
		Resume resume = new Resume();
		
		try (InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(resumeFileName)) {
			// pass InputStream to JSON-Library, e.g. using Jackson
			ObjectMapper mapper = new ObjectMapper();
			resume = mapper.readValue(in, Resume.class);
		} catch (Exception e) {
			System.out.println("Could not find file " + resumeFileName + " in resources");
			throw new RuntimeException(e);
		}

		return resume;
	}

	private InputStream getFileFromResourceAsStream(String fileName) {

		// The class loader that loaded the class
		ClassLoader classLoader = getClass().getClassLoader();
		InputStream inputStream = classLoader.getResourceAsStream(fileName);

		// the stream holding the file content
		if (inputStream == null) {
			throw new IllegalArgumentException("file not found! " + fileName);
		} else {
			return inputStream;
		}

	}
}
