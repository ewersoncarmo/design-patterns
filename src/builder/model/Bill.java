package builder.model;

import java.time.LocalDate;
import java.util.List;

public class Bill {

	private String corporateName;
	private String cnpj;
	private LocalDate data;
	private double value;
	private double taxes;
	private List<Item> items;
	private String comments;

	public Bill(String corporateName, String cnpj, LocalDate data, double value, double taxes, List<Item> items,
			String comments) {
		this.corporateName = corporateName;
		this.cnpj = cnpj;
		this.data = data;
		this.value = value;
		this.taxes = taxes;
		this.items = items;
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Bill [corporateName=" + corporateName + ", cnpj=" + cnpj + ", data=" + data + ", value=" + value
				+ ", taxes=" + taxes + ", items=" + items + ", comments=" + comments + "]";
	}

}
