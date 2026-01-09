class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int friendId) {
        this.friendId = friendId;
    }
}
class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friends;
    UserNode next;
    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
    }
}
class SocialMediaList {
    private UserNode head;
    void addUser(int id, String name, int age) {
        UserNode user = new UserNode(id, name, age);
        user.next = head;
        head = user;
    }
    private UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }
    void searchUserByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                printUser(temp);
                return;
            }
            temp = temp.next;
        }
    }
    void addFriendConnection(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);
        if (u1 == null || u2 == null) return;
        u1.friends = addFriend(u1.friends, id2);
        u2.friends = addFriend(u2.friends, id1);
    }
    private FriendNode addFriend(FriendNode head, int id) {
        FriendNode node = new FriendNode(id);
        node.next = head;
        return node;
    }
    void removeFriendConnection(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);
        if (u1 == null || u2 == null) return;
        u1.friends = removeFriend(u1.friends, id2);
        u2.friends = removeFriend(u2.friends, id1);
    }
    private FriendNode removeFriend(FriendNode head, int id) {
        if (head == null) return null;
        if (head.friendId == id) return head.next;
        FriendNode temp = head;
        while (temp.next != null) {
            if (temp.next.friendId == id) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) return;
        FriendNode temp = user.friends;
        while (temp != null) {
            System.out.println("Friend ID: " + temp.friendId);
            temp = temp.next;
        }
    }
    void findMutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);
        if (u1 == null || u2 == null) return;
        FriendNode f1 = u1.friends;
        while (f1 != null) {
            FriendNode f2 = u2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.println("Mutual Friend ID: " + f1.friendId);
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }
    }
    void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }
    private void printUser(UserNode u) {
        System.out.println(u.userId + " | " + u.name + " | " + u.age);
    }
}
public class SocialMediaFriends {
    public static void main(String[] args) {
        SocialMediaList app = new SocialMediaList();
        app.addUser(1, "Ankit", 22);
        app.addUser(2, "Rahul", 23);
        app.addUser(3, "Neha", 21);
        app.addUser(4, "Priya", 22);
        app.addFriendConnection(1, 2);
        app.addFriendConnection(1, 3);
        app.addFriendConnection(2, 3);
        app.addFriendConnection(2, 4);
        app.displayFriends(1);
        System.out.println();
        app.findMutualFriends(1, 2);
        System.out.println();
        app.countFriends();
    }
}
