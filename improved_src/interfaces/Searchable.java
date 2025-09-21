package interfaces;

/**
 * Interface for entities that can be searched
 */
public interface Searchable {
    int getId();
    String getName();
    boolean matches(String searchTerm);
}