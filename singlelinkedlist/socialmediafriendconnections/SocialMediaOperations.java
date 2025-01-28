package singlelinkedlist.socialmediafriendconnections;

// Class to manage users and their friend connections
class SocialMediaOperations
{
    UserInformation head;

    // Constructor
    public SocialMediaOperations()
    {
        head = null;
    }

    // Add a friend connection between two users
    public void addFriendConnection(int userID, int friendID)
    {
        UserInformation user = findUserByID(userID);
        if (user != null)
        {
            FriendList newFriend = new FriendList(friendID);
            newFriend.next = user.friends;
            user.friends = newFriend;
        }
        else
        {
            System.out.println("User not found");
        }
    }

    // Remove a friend connection
    public void removeFriendConnection(int userID, int friendID)
    {
        UserInformation user = findUserByID(userID);
        if (user != null)
        {
            FriendList prev = null;
            FriendList temp = user.friends;
            while (temp != null)
            {
                if (temp.friendID == friendID)
                {
                    if (prev == null)
                    {
                        user.friends = temp.next;
                    }
                    else
                    {
                        prev.next = temp.next;
                    }
                    System.out.println("Friend connection removed");
                    return;
                }
                prev = temp;
                temp = temp.next;
            }
            System.out.println("Friend not found");
        }
        else
        {
            System.out.println("User not found");
        }
    }

    // Find mutual friends between two users
    public void findMutualFriends(int userID1, int userID2)
    {
        UserInformation user1 = findUserByID(userID1);
        UserInformation user2 = findUserByID(userID2);
        if (user1 != null && user2 != null)
        {
            System.out.println("Mutual friends between user " + userID1 + " and " + userID2 + " is ");
            FriendList temp1 = user1.friends;
            while (temp1 != null)
            {
                FriendList temp2 = user2.friends;
                while (temp2 != null)
                {
                    if (temp1.friendID == temp2.friendID)
                    {
                        System.out.println("Friend ID " + temp1.friendID);
                    }
                    temp2 = temp2.next;
                }
                temp1 = temp1.next;
            }
        }
        else
        {
            System.out.println("One or both users not found");
        }
    }

    // Search for a user by name or user ID
    public UserInformation findUserByID(int userID)
    {
        UserInformation temp = head;
        while (temp != null)
        {
            if (temp.userID == userID)
            {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Add a new user
    public void addUser(int userID, String name, int age)
    {
        UserInformation newUser = new UserInformation(userID, name, age);
        if (head == null)
        {
            head = newUser;
        }
        else
        {
            UserInformation temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newUser;
        }
    }

    // Count the number of friends for each user
    public void countFriends()
    {
        UserInformation temp = head;
        while (temp != null)
        {
            int count = 0;
            FriendList friendTemp = temp.friends;
            while (friendTemp != null)
            {
                count++;
                friendTemp = friendTemp.next;
            }
            System.out.println("User " + temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    // Display all friends of a user
    public void displayFriends(int userID)
    {
        UserInformation user = findUserByID(userID);
        if (user != null)
        {
            System.out.println("Friends of " + user.name + " ");
            FriendList temp = user.friends;
            while (temp != null)
            {
                System.out.println("Friend ID is " + temp.friendID);
                temp = temp.next;
            }
        }
        else
        {
            System.out.println("User not found");
        }
    }
}
