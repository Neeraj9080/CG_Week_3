package singlelinkedlist.socialmediafriendconnections;

// Main class
public class SocialMediaSystem
{
    public static void main(String[] args)
    {
        SocialMediaOperations friend = new SocialMediaOperations();

        // Adding users
        friend.addUser(101, "Rajan", 21);
        friend.addUser(102, "Sachin", 22);
        friend.addUser(103, "Abhishek", 23);

        // Adding friend connections
        friend.addFriendConnection(101, 201);
        friend.addFriendConnection(101, 202);
        friend.addFriendConnection(102, 202);

        // Displaying friends
        friend.displayFriends(101);
        friend.displayFriends(102);

        // Finding mutual friends
        friend.findMutualFriends(101, 102);

        // Counting friends
        friend.countFriends();

        // Removing a friend connection
        friend.removeFriendConnection(101, 201);

        // Displaying friends after removal
        friend.displayFriends(101);
    }
}
