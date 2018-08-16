package io.pivotal.directoryservice.repository;

import io.pivotal.directoryservice.domain.Directory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectoryRepository extends CrudRepository<Directory, Long> {
}
