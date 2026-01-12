package adopet.api.repository;

import adopet.api.model.Adocao;
import adopet.api.model.StatusAdocao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdocaoRepository extends JpaRepository<Adocao,Long> {

}
