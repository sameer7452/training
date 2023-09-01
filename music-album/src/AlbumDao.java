import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public interface AlbumDao {
	
	
	void persist(Album a);
	List<Album> findByTitle(String title) throws InvalidAlbumException;
	List<Album> list();
	List<Album> findByArtist(String Artist);
	List<Album> findByGenre(String Genre);
	boolean update(Album a);
	boolean delete(String title)throws InvalidAlbumException;
	
	

}
