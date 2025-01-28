package singlelinkedlist.socialmediafriendconnections;

// Class to store friends list for each user
class FriendList
{
    int friendID;
    FriendList next;

    // Constructor of the class
    public FriendList(int friendID)
    {
        this.friendID = friendID;
        this.next = null;
    }
}
