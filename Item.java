package ir.freeland.springboot.persistence.model;


/*import java.util.Date;*/

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
/*import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;*/
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
/*import jakarta.persistence.Temporal;
/*import jakarta.persistence.TemporalType;*/
import jakarta.persistence.Transient;

@Entity
@Table(name="YH_ITEM")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "itemName", length = 50, nullable = false, unique = true)
	private String name;
	@Transient
	private Integer price;
	@Column(name = "category", length = 50)
	private String category;
	
	 @OneToOne(mappedBy = "item") //This is bidirection relation ship
	    private CorruptedItem corruptedItem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public CorruptedItem getCorruptedItem() {
        return corruptedItem;
    }

    public void setCorruptedItem(CorruptedItem corruptedItem) {
        this.corruptedItem = corruptedItem;
    }

	@Override
	public String toString() {
		return "item [name=" + name + ", price=" + price
				+ ", category=" + category + "]";
	}
	

}
