@Path("/account")
        public class Accounts {
            DbConnection connect=new DbConnection();
            Connection conn=null;

            AccountService service=new AccountService();

            @POST 
            @Consumes(MediaType.APPLICATION_JSON)// specifies the request body content
            @Produces(MediaType.APPLICATION_JSON)
            public Person addMessage(Accounts account) throws Exception{
            return service.addMessage(account);
        }
        }   

public class AccountService {

            DbConnection connect=new DbConnection();
            Connection conn=null;

            public Person addMessage(Accounts account) throws Exception {

            Person p=new Person();
            String sql="insert into Accounts values(1234,'Kavita Singh',988982,'test address')";
            conn=connect.databaseConnection();
            PreparedStatement pst=conn.prepareStatement(sql);
                pst.setString(1,p.getaccount());
                pst.setString(2,p.getName());  
                pst.setString(2,p.getMobile());  
                pst.setString(2,p.getAddress());  
                pst.executeUpdate();
                pst.close();
                return account;
        }
        }


