package mdoels;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@NamedQueries({
    @NamedQuery(
            name = "getAllTasks",
            query = "SELECT m FROM Message AS m ORDER BY m.id DESC"
            )
})
@Table(name = "tasks")
public class Message {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "input_date", nullable = false)
	private Timestamp input_date;

	@Column(name = "output_date", nullable = false)
	private Timestamp output_date;

	@Column(name = "content", length = 255, nullable = false)
	private String content;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getInput_date() {
		return input_date;
	}

	public void setInput_date(Timestamp input_date) {
		this.input_date = input_date;
	}

	public Timestamp getOutput_date() {
		return output_date;
	}

	public void setOutput_date(Timestamp output_date) {
		this.output_date = output_date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}