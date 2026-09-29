package service;

import java.util.List;

public interface CommonService <T> {

    List<T> getAll();

    T getByFinCode(String finCode);

    void create(T object);

    void delete(String finCode);

    void update(String finCode,String fullName);

}
