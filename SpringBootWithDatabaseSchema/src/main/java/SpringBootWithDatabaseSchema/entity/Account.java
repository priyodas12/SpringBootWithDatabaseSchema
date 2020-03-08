package SpringBootWithDatabaseSchema.entity;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private BigInteger id;
	private String holderName;
	private String market;
	private double avlBlnc;
	private double creditBlnc;
	private String cardType;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public double getAvlBlnc() {
		return avlBlnc;
	}
	public void setAvlBlnc(double avlBlnc) {
		this.avlBlnc = avlBlnc;
	}
	public double getCreditBlnc() {
		return creditBlnc;
	}
	public void setCreditBlnc(double creditBlnc) {
		this.creditBlnc = creditBlnc;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	
	protected Account() {
		super();
	}
	public Account(String holderName, String market, double avlBlnc, double creditBlnc,
			String cardType) {
		super();
		
		this.holderName = holderName;
		this.market = market;
		this.avlBlnc = avlBlnc;
		this.creditBlnc = creditBlnc;
		this.cardType = cardType;
	}

}
