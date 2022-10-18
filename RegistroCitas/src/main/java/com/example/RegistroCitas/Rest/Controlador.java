package com.example.RegistroCitas.Rest;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public void  medicoAll(String query)
        throws URISyntaxException, IOException {
            CloseableHttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(url);
            URI uri = new URIBuilder(request.getURI())
            .addParameter("query", query)
            .build();
            request.setURI(uri);

            System.out.println( client.execute(request));
            
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
