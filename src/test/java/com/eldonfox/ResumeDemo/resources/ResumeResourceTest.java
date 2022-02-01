package com.eldonfox.ResumeDemo.resources;

import org.junit.Before;
import org.junit.Test;

import com.w3foxes.sarah.ResumeDemo.api.Resume;
import com.w3foxes.sarah.ResumeDemo.resources.ResumeResource;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class ResumeResourceTest {

	private ResumeResource resource;
	
    @Before
    public void setup() {
        // Before each test, we re-instantiate our resource so it will reset
        // the counter. It is good practice when dealing with a class that
        // contains mutable data to reset it so tests can be ran independently
        // of each other.
        resource = new ResumeResource();
    }

	
	/**
	 * Check that we get a resume, at that it's the correct one.
	 */
	@Test
	public void testGetResume() {
		Resume resume = resource.getResume(null);
		
		assertNotNull(resume);
		assertNotNull(resume.getContactInfo());
		assertEquals(resume.getContactInfo().getName(), "Sarah Fox");
	}

}
