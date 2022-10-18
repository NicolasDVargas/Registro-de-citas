package com.example.RegistroCitas.Rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.aexp.nodes.graphql.GraphQLRequestEntity;
import io.aexp.nodes.graphql.GraphQLTemplate;

@RestController
@RequestMapping("citas")
public class Controlador {

    public String url = "https://api.spacex.land/graphql/";
    public String query = """
            {
                                    launchesPast(limit: 10) {
                                    mission_name
                                    launch_date_local
                                    launch_site {
                                        site_name_long
                                    }
                                    links {
                                        article_link
                                        video_link
                                    }
                                    rocket {
                                        rocket_name
                                        first_stage {
                                        cores {
                                            flight
                                            core {
                                            reuse_count
                                            status
                                            }
                                        }
                                        }
                                        second_stage {
                                        payloads {
                                            payload_type
                                            payload_mass_kg
                                            payload_mass_lbs
                                        }
                                        }
                                    }
                                    ships {
                                        name
                                        home_port
                                        image
                                    }
                                    }
                                }""";

    @GetMapping("estado-cita/all")
    public void cita() {

    }

    @GetMapping("medico/id")
    public void medicoId(@RequestParam(name = "id") Long idMedico) {
        System.out.println("sdfniosdnvnseilovnlosdnb");

    }

    @GetMapping("medico/all")
    public void medicoAll()
     throws URISyntaxException, IOException {

         /*throws IOException {
            GraphQLTemplate graphQLTemplate = new GraphQLTemplate();
            GraphQLRequestEntity requestEntity = GraphQLRequestEntity.Builder()
            .url(StringUtils.join(url, "?query=", query))
            .request(Data.class)
            .build();
            return graphQLTemplate.query(requestEntity, Data.class);
        }*/

     /* URL Url = new URL(url);
     * HttpURLConnection con = (HttpURLConnection)Url.openConnection();
     * con.setRequestMethod("POST");
     * con.setRequestProperty("Content-Type", "application/json");
     * con.setRequestProperty("Accept", "application/json");
     * con.setDoOutput(true);
     * try (OutputStream os=con.getOutputStream()) {
     * byte[] input = query.getBytes("UTF-8");
     * os.write(input,0,input.length);
     * }
     * try(BufferedReader br = new BufferedReader(new
     * InputStreamReader(con.getInputStream(),"UTF-8"))) {
     * StringBuilder response = new StringBuilder();
     * String responseLine = null;
     * while((responseLine = br.readLine())!= null){
     * response.append(responseLine.trim());
     * }
     * System.out.println(response);
     * }
     */

        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        URI uri = new URIBuilder(request.getURI())
          .addParameter("query", query)
          .build();
        request.setURI(uri);
        CloseableHttpResponse httpResponse  = client.execute(request);
        HttpEntity entity = httpResponse.getEntity();
        String actualResponse = EntityUtils.toString(entity);

        //String actualResponse =  IOUtils.toString( httpResponse.getEntity().getContent(), StandardCharsets.UTF_8.name());
       
        
        System.out.println(actualResponse);
        System.out.println("nfsnkgnkilsenfgkunse");
      
    }
     
      
    @GetMapping("eps")
    public void medicosEPS(@RequestParam(name = "eps") Integer idEPS) {

    }

    @GetMapping("eps/medico/dia/mes/anno")
    public void medicosDisponibles(@RequestParam(name = "eps") Integer idEPS,
            @RequestParam(name = "medico") Integer idMedico, @RequestParam(name = "dia") Integer dia,
            @RequestParam(name = "mes") Integer mes, @RequestParam(name = "anno") Integer anno) {

    }

}
