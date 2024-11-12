package dap.spotifyAPI.products.jazz;

import dap.spotifyAPI.utils.Song;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.michaelthelin.spotify.SpotifyApi;

import java.util.List;


public abstract class JazzProduct {
  protected Logger _logger = LoggerFactory.getLogger(JazzProduct.class);
  public abstract List<Song> create(SpotifyApi spotifyApi, int amount);
}