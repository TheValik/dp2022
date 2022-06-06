package lab5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import lab5.gpu.GPU;

@RepositoryRestResource
@CrossOrigin(origins = "*")

	//@RepositoryRestResource(collectionResourceRel = "user1", path = "user")
	public interface gpuRepository extends JpaRepository<GPU, Integer> {

	//  List<User> findByLastName(@Param("name") String name);

	
}
