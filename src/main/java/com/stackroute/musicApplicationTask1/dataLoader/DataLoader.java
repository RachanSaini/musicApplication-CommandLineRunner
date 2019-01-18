package com.stackroute.musicApplicationTask1.dataLoader;

import com.stackroute.musicApplicationTask1.domain.Track;
import com.stackroute.musicApplicationTask1.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class DataLoader implements CommandLineRunner {

    //private final Logger logger = (Logger) LoggerFactory.getLogger(DataLoader.class);
    //used to give output on console


    private TrackService trackService;

    @Autowired
    public DataLoader(TrackService trackService) {
        this.trackService = trackService;
    }

    @Override
    public void run(String... args) throws Exception {
      //  logger.info("Loading data...");

        Track track1 = new Track();
        track1.setTrackName("Magic");
        track1.setComments("Cold Play");
        trackService.saveTrack(track1);

        Track track2 = new Track();
        track2.setTrackName("Wakka Wakka");
        track2.setComments("Shakira");
        trackService.saveTrack(track2);

        Track track3 = new Track();
        track3.setTrackName("Kal ho na ho");
        track3.setComments("Sonu nigam");
        trackService.saveTrack(track3);

        Track track4 = new Track();
        track4.setTrackName("Wakh");
        track4.setComments("Amrinder Gill");
        trackService.saveTrack(track4);

        Track track5 = new Track();
        track5.setTrackName("Dil");
        track5.setComments("Diljit Dosanjh");
        trackService.saveTrack(track5);




    }
}
