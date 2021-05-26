package Customer_Management;


	public class CustomerManagerVO extends commVo{

	    	private    int      IssuanceNumber   		=  0     ;
	    	private    String   CustomerName       	    =  null  ;
	    	private    String   NameOfRepresentative    =  null  ;
	    	private    int      BusinRegNum   	 	    =  0     ;
	    	private    String   BusinType      	 	    =  null  ;
	    	private    String   BusinItem       		    =  null  ;
	    	private    int      Postcode    	        =  0     ;
	    	private    String   Address                 =  null  ;
	    	private    String   DetailAddress           =  null  ;
	    	private    String   Email                   =  null  ;
	        private    int      Tel                     =  0     ;
	    	private    int      HP                      =  0     ;
	        private    int      Fax                     =  0     ;
	        private    String   CustomerNameToBill      =  null  ;
	        private    String   BankName                =  null  ;
	        private    String   AccountHolder           =  null  ;
	        private    int      AccountNumber           =  0     ;
	        private    String   RegiDate                =  null  ;
	        private    String   CloseDate               =  null  ;
	        private    String   Memo                    =  null  ;
	        //private    Object   result                  =  null  ;

	public CustomerManagerVO() {}        
		
	public CustomerManagerVO(
			 int      IssuanceNumber   	
			,String   CustomerName       	
			,String   NameOfRepresentative
			,int      BusinRegNum   	 	
			,String   BusinType      	 	
			,String   BusinItem       	
			,int      Postcode    	    
			,String   Address             
			,String   DetailAddress       
			,String   Email               
			,int      Tel                 
			,int      HP                  
			,int      Fax                 
			,String   CustomerNameToBill  
			,String   BankName            
			,String   AccountHolder       
			,int      AccountNumber       
			,String   RegiDate            
			,String   CloseDate           
			,String   Memo                ) {
		                            
		this.IssuanceNumber   	    =    IssuanceNumber   	   ;
		this.CustomerName           =    CustomerName          ;
		this.NameOfRepresentative   =    NameOfRepresentative  ;
		this.BusinRegNum   	 	    =    BusinRegNum   	 	   ;
		this.BusinType      	    =    BusinType      	   ;
		this.BusinItem       	    =    BusinItem       	   ;
		this.Postcode    	        =    Postcode    	       ;
		this.Address                =    Address               ;
		this.DetailAddress          =    DetailAddress         ;
		this.Email                  =    Email                 ;
		this.Tel                    =    Tel                   ;
		this.HP                     =    HP                    ;
		this.Fax                    =    Fax                   ;
		this.CustomerNameToBill     =    CustomerNameToBill    ;
		this.BankName               =    BankName              ;
		this.AccountHolder          =    AccountHolder         ;
		this.AccountNumber          =    AccountNumber         ;
		this.RegiDate               =    RegiDate              ;
		this.CloseDate              =    CloseDate             ;
		this.Memo                   =    Memo                  ;
		
		
	}

	public int getIssuanceNumber() 
	{return IssuanceNumber;}
	public void setIssuanceNumber(int issuanceNumber)
	{IssuanceNumber = issuanceNumber;}
	public String getCustomerName() 
	{return CustomerName;}
	public void setCustomerName(String customerName) 
	{CustomerName = customerName;}
	public String getNameOfRepresentative() 
	{return NameOfRepresentative;}
	public void setNameOfRepresentative(String nameOfRepresentative) 
	{NameOfRepresentative = nameOfRepresentative;}
	public int getBusinRegNum()
	{return BusinRegNum;}
	public void setBusinRegNum(int businRegNum)
	{BusinRegNum = businRegNum;}
	public String getBusinType()
	{return BusinType;}
	public void setBusinType(String businType)
	{BusinType = businType;}
	public String getBusinItem()
	{return BusinItem;}
	public void setBusinItem(String businItem) 
	{BusinItem = businItem;}
	public int getPostcode()
	{return Postcode;}
	public void setPostcode(int postcode) 
	{Postcode = postcode;}
	public String getAddress()
	{return Address;}
	public void setAddress(String address) 
	{Address = address;}
	public String getDetailAddress() 
	{return DetailAddress;}
	public void setDetailAddress(String detailAddress)
	{DetailAddress = detailAddress;}
	public String getEmail() 
	{return Email;}
	public void setEmail(String email) 
	{Email = email;}
	public int getTel()
	{return Tel;}
	public void setTel(int tel)
	{Tel = tel;}
	public int getHP() 
	{return HP;}
	public void setHP(int hP) 
	{HP = hP;}
	public int getFax() 
	{return Fax;}
	public void setFax(int fax) 
	{Fax = fax;}
	public String getCustomerNameToBill() 
	{return CustomerNameToBill;}
	public void setCustomerNameToBill(String customerNameToBill)
	{CustomerNameToBill = customerNameToBill;}
	public String getBankName() 
	{return BankName;}
	public void setBankName(String bankName) 
	{BankName = bankName;}
	public String getAccountHolder()
	{return AccountHolder;}
	public void setAccountHolder(String accountHolder) {AccountHolder = accountHolder;}
	public int getAccountNumber()
	{return AccountNumber;}
	public void setAccountNumber(int accountNumber) 
	{AccountNumber = accountNumber;}
	public String getRegiDate()
	{return RegiDate;}
	public void setRegiDate(String regiDate) 
	{RegiDate = regiDate;}
	public String getCloseDate()
	{return CloseDate;}
	public void setCloseDate(String closeDate)
	{CloseDate = closeDate;}
	public String getMemo()
	{return Memo;}
	public void setMemo(String memo) 
	{Memo = memo;}
	/*
	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
    */
}