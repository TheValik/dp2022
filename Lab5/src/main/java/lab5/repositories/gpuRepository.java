package lab5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import lab5.gpu.GPU;

	//@RepositoryRestResource(collectionResourceRel = "user1", path = "user")
	public interface gpuRepository extends JpaRepository<GPU, Integer> {

	//  List<User> findByLastName(@Param("name") String name);

	
}
