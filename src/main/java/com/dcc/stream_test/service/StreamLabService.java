package com.dcc.stream_test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcc.stream_test.models.Product;
import com.dcc.stream_test.models.Role;
import com.dcc.stream_test.models.User;
import com.dcc.stream_test.repository.ProductsRepository;
import com.dcc.stream_test.repository.RolesRepository;
import com.dcc.stream_test.repository.ShoppingcartItemRepository;
import com.dcc.stream_test.repository.UsersRepository;

@Service
public class StreamLabService {
	
//	@Autowired
//	private RepositoryWrapper _context;
	
	@Autowired
	private ProductsRepository products;
	@Autowired
	private RolesRepository roles;
	@Autowired
	private UsersRepository users;
	@Autowired
	private ShoppingcartItemRepository shoppingcartitems;
	
	public List<User> test(){
		return users.findAll();
	}
	
    public long ProblemOne() {
    	// Write a query that returns the number of users in the Users table.
    	return users.findAll().stream().count();
    }
    
    public List<User> ProblemTwo()
    {
        // Write a query that retrieves the users from the User tables then print each user's email to the console.
    	return users.findAll();

    }

    public List<Product> ProblemThree()
    {
        // Write a query that gets each product where the products price is greater than $150.
    	return null;
    }

    public List<Product> ProblemFour()
    {
        // Write a query that gets each product that contains an "s" in the products name.
    	return null;
    }

    public List<User> ProblemFive()
    {
        // Write a query that gets all of the users who registered BEFORE 2016
    	return null;
    }

    public List<User> ProblemSix()
    {
        // Write a LINQ query that gets all of the users who registered AFTER 2016 and BEFORE 2018
        // Then print each user's email and registration date to the console.
    	return null;
    }

    // <><><><><><><><> R Actions (Read) with Foreign Keys <><><><><><><><><>

    public List<User> ProblemSeven()
    {
        // Write a query that retreives all of the users who are assigned to the role of Customer.
        // Then print the users email and role name to the console.
//        var customerUsers = _context.UserRoles.Include(ur => ur.Role).Include(ur => ur.User).Where(ur => ur.Role.RoleName == "Customer");
//        foreach (UserRole userRole in customerUsers)
//        {
//            Console.WriteLine($"Email: {userRole.User.Email} Role: {userRole.Role.RoleName}");
//        }
        
    	return null;
    }

    public List<Product> ProblemEight()
    {
        // Write a query that retreives all of the products in the shopping cart of the user who has the email "afton@gmail.com".
        // Then print the product's name, price, and quantity to the console.
    	return null;
    }

    public long ProblemNine()
    {
        // Write a query that retrieves all of the products in the shopping cart of the user who has the email "oda@gmail.com" and returns the sum of all of the products prices.
        // HINT: End of query will be: .Select(sc => sc.Product.Price).Sum();
        // Then print the total of the shopping cart to the console.
    	return 0;
    }

    public List<Product> ProblemTen()
    {
        // Write a query that retrieves all of the products in the shopping cart of users who have the role of "Employee".

    	return null;
    }

    // <><><><><><><><> CUD (Create, Update, Delete) Actions <><><><><><><><><>

    // <><> C Actions (Create) <><>

    public void ProblemEleven()
    {
        // Create a new User object and add that user to the Users table using LINQ.
        User newUser = new User();        
        newUser.setEmail("david@gmail.com");
        newUser.setPassword("DavidsPass123");
        users.save(newUser);
    }

    public void ProblemTwelve()
    {
        // Create a new Product object and add that product to the Products table.

    }

    public void ProblemThirteen()
    {
        // Add the role of "Customer" to the user we just created in the UserRoles junction table.
    	Role customerRole = roles.findAll().stream().filter(r -> r.getName() == "Customer").findFirst().orElse(null);
    	User david = users.findAll().stream().filter(u -> u.getEmail() == "david@gmail.com").findFirst().orElse(null);
    	david.addRole(customerRole);
    }

    public void ProblemFourteen()
    {
        // Add the product you created to the user we created in the ShoppingCart junction table.

    }

    // <><> U Actions (Update) <><>

    public void ProblemFifteen()
    {
        // Update the email of the user we created to "mike@gmail.com"
//        var user = _context.Users.Where(u => u.Email == "david@gmail.com").SingleOrDefault();
//        user.Email = "mike@gmail.com";
//        _context.Users.Update(user);
//        _context.SaveChanges();
    }

    public void ProblemSixteen()
    {
        // Update the price of the product you created to something different using LINQ.

    }

    public void ProblemSeventeen()
    {
        // Change the role of the user we created to "Employee"
        // HINT: You need to delete the existing role relationship and then create a new UserRole object and add it to the UserRoles table
        // See problem eighteen as an example of removing a role relationship
//        var userRole = _context.UserRoles.Where(ur => ur.User.Email == "mike@gmail.com").SingleOrDefault();
//        _context.UserRoles.Remove(userRole);
//        UserRole newUserRole = new UserRole()
//        {
//            UserId = _context.Users.Where(u => u.Email == "mike@gmail.com").Select(u => u.Id).SingleOrDefault(),
//            RoleId = _context.Roles.Where(r => r.RoleName == "Employee").Select(r => r.Id).SingleOrDefault()
//        };
//        _context.UserRoles.Add(newUserRole);
//        _context.SaveChanges();
    }

    // <><> D Actions (Delete) <><>

    public void ProblemEighteen()
    {
        // Delete the role relationship from the user who has the email "oda@gmail.com" using LINQ.

    }

    public void ProblemNineteen()
    {
        // Delete all of the product relationships to the user with the email "oda@gmail.com" in the ShoppingCart table using LINQ.
        // HINT: Loop
//        var shoppingCartProducts = _context.ShoppingCarts.Where(sc => sc.User.Email == "oda@gmail.com");
//        foreach (ShoppingCart userProductRelationship in shoppingCartProducts)
//        {
//            _context.ShoppingCarts.Remove(userProductRelationship);
//        }
//        _context.SaveChanges();
    }

    public void ProblemTwenty()
    {
        // Delete the user with the email "oda@gmail.com" from the Users table using LINQ.

    }
    
    
    
    
	

}
