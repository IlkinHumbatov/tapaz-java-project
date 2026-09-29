package impl;

import entity.User;
import service.CommonService;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements CommonService<User>, UserService {

    static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User("78pyh1q", 28, "Ramin Hasanov", "0519800030", 'M', "Baku", 1998));
        users.add(new User("34ujk74", 31, "Samir Qeribov", "0514211212", 'M', "Quba", 1985));
        users.add(new User("desk158", 29, "Murad Agayev", "0707808018", 'M', "Gence", 1997));
        users.add(new User("81jkl1", 21, "Murad Huseynov", "0552501202", 'M', "Baku", 2005));
        users.add(new User("78lkzm", 26, "Aqil Agayev", "0557071202", 'M', "Seki", 2000));
        users.add(new User("4n45xtm", 23, "Senan Qarayev", "0559991202", 'M', "Baku", 2003));
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User getByFinCode(String finCode) {
        for (User user : users) {
            if (user.getFinCode().equals(finCode)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void create(User object) {
        users.add(object);
    }

    @Override
    public void delete(String finCode) {
        User user = getByFinCode(finCode);

        if (user != null) {
            users.remove(user);
        }
    }

    @Override
    public void update(String finCode, String fullName) {
        User user = getByFinCode(finCode);

        if (user != null) {
            user.setFullName(fullName);
        }
    }

    @Override
    public void changePhoneNumber(String finCode, String newPhoneNumber) {
        User user = getByFinCode(finCode);

        if (user != null) {
            user.setPhoneNumber(newPhoneNumber);
        }
    }

    @Override
    public void changePlaceOfBirth(String finCode, String newPlaceOfBirth) {
 User user = getByFinCode(finCode);
        if (user != null) {
            user.setPlaceOfBirth(newPlaceOfBirth);
        }
    }


    @Override
    public List<User> getByAgeGreaterThan(Integer age) {
        return users.stream()
                .filter(user -> user.getAge() > age)
                .toList();
    }

    @Override
    public List<User> getByPlaceOfBirth(String placeOfBirth) {
        return users.stream()
                .filter(user -> user.getPlaceOfBirth().equalsIgnoreCase(placeOfBirth))
                .toList();
    }

    @Override
    public List<User> getByGender(Character gender) {
        return users.stream()
                .filter(user -> user.getGender() == gender)
                .toList();
    }

    @Override
    public List<User> getByNameContains(String text) {
        return users.stream()
                .filter(user -> user.getFullName()
                        .toLowerCase()
                        .contains(text.toLowerCase()))
                .toList();
    }


}




