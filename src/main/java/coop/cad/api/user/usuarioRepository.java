package coop.cad.api.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository<Usuarios, Long> {
}
