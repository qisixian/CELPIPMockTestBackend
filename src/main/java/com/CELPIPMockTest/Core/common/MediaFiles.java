package com.CELPIPMockTest.Core.common;

public class MediaFiles {
    private int id;
    private String name;
    private byte[] data;

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    //constructor
    public MediaFiles() {
    }

    public MediaFiles(int id, String name, byte[] data) {
        this.id = id;
        this.name = name;
        this.data = data;
    }

    //toString
    @Override
    public String toString() {
        return "MediaFiles{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", data=" + data +
                '}';
    }
}
