package io.swagger.api;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.ApiParam;
import io.swagger.model.ExternalDocs;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-06T00:02:54.899+01:00")

@Controller
public class DefaultApiController implements DefaultApi {

	private static final Logger log = LoggerFactory.getLogger(DefaultApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	private final ClientApi clientApi;

	@org.springframework.beans.factory.annotation.Autowired
	public DefaultApiController(ObjectMapper objectMapper, HttpServletRequest request, ClientApi clientApi) {
		this.objectMapper = objectMapper;
		this.request = request;
		this.clientApi = clientApi;
	}

	public ResponseEntity<byte[]> rootGet(
			@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "url", required = true) List<String> url) {
		String accept = request.getHeader("Accept");
		
		byte[] by = null;
		if (accept != null && accept.contains("video/mp4")) {

			for (String urlUni : url) {

				String html = clientApi.rootGet(urlUni);

				try {

					ResponseEntity<ExternalDocs> eDocs = new ResponseEntity<ExternalDocs>(
							objectMapper.readValue(html, ExternalDocs.class), HttpStatus.NOT_IMPLEMENTED);
					log.error(eDocs.getBody().getTitle());
					log.error(eDocs.getBody().getStreams().get(0).getUrl());

					by = downloadUrl(new URL(eDocs.getBody().getStreams().get(0).getUrl()));

					Path path = Paths.get("D:\\2019\\" + eDocs.getBody().getTitle() + ".mp4");
					Files.write(path, by);

					// log.error(by.toString());


				} catch (IOException e) {
					log.error("Couldn't serialize response for content type application/json", e);
					return new ResponseEntity<byte[]>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
		}

		return new ResponseEntity<byte[]>(by, HttpStatus.OK);
	}

	private byte[] downloadUrl(URL toDownload) {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

		try {
			byte[] chunk = new byte[4096];
			int bytesRead;
			InputStream stream = toDownload.openStream();

			while ((bytesRead = stream.read(chunk)) > 0) {
				outputStream.write(chunk, 0, bytesRead);
			}

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

		return outputStream.toByteArray();
	}

}