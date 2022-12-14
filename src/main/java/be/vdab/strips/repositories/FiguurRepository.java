package be.vdab.strips.repositories;

import be.vdab.strips.domain.Figuur;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FiguurRepository {
  private final JdbcTemplate template;
  private final RowMapper<Figuur> figuurRowMapper = (result, rowNum) ->
    new Figuur(result.getLong("id"), result.getString("naam"));

  public FiguurRepository(JdbcTemplate template) {
    this.template = template;
  }

  public List<Figuur> findAll() {
    var sql = "SELECT id, naam FROM figuren ORDER BY naam";
    return template.query(sql, figuurRowMapper);
  }
}
