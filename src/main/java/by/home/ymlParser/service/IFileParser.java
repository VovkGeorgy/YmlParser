package by.home.ymlParser.service;

import java.util.List;

/**
 * File data parser interface
 */
public interface IFileParser {

    /**
     * Parse string data to list of specific String objects
     *
     * @param fileData input file data
     * @return List of String object
     */
    List<String> parseFileData(String fileData);
}
