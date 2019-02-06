package by.home.ymlParser.service;

import java.io.File;

/**
 * File service interface
 */
public interface IFileService {

    /**
     * Get file from path
     *
     * @param filePath path to file
     * @return file instance
     */
    File getFile(String filePath);

    /**
     * Write string data in file
     *
     * @param fileData         file data
     * @param pathToOutputFile path to output file
     * @return result of writing
     */
    boolean writeInFile(String fileData, String pathToOutputFile);

    /**
     * Method read data from file
     *
     * @param file file for data reading
     * @return data in string
     */
    String readFile(File file);
}
