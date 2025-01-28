package singlelinkedlist.socialmediafriendconnections;

class UserInformation
{
    int userID;
    String name;
    int age;
    UserInformation next;
    FriendList friends;

    // Constructor of the class
    public UserInformation(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.next = null;
        this.friends = null;
    }
}

