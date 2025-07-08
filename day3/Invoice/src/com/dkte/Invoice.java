
package com.dkte;

class Invoice {

	
		String partno;
		String des;
		int quantity;
		double price;
		
		public Invoice(String partno, String des,int quantity,double price) {
			this.partno=partno;
			this.des=des;
			
			if(quantity>0)
			{
				this.quantity=quantity;
			}
			else {
				this.quantity=0;
			}
			
			if(price>0)
			{
				this.price=price;
			}
			else {
				this.price=0.0;
			}
			
			
			
		}

		public String getPartno() {
			return partno;
		}

		public void setPartno(String partno) {
			this.partno = partno;
		}

		public String getDes() {
			return des;
		}

		public void setDes(String des) {
			this.des = des;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			if(quantity>0) 
			 this.quantity = quantity;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			if(price>0)
			this.price = price;
		}
		
		public void calculate() {
			double cal=quantity*price;
			System.out.println("Invoice Amount:" +cal);
		}

	

}
