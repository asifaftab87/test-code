package org.la.test.code.codility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TaskController {

    @Autowired
    private TaskRepository repository;

    @PutMapping("/tasks/{id}")
    ResponseEntity<TaskDTO> findById(@PathVariable(name = "id") long id, @RequestBody TaskDTO taskDTO) {
        ErrorMessage errorMessage = new ErrorMessage();
        if (taskDTO.getDescription() == null || taskDTO.getDescription().isBlank()) {
            errorMessage.setMessage("Task description is required");
            errorMessage.setStatus(400);
            return new ResponseEntity(errorMessage, HttpStatus.BAD_REQUEST);
        }
        Optional<Task> optional = repository.findById(id);
//        if (optional.isPresent()) {
//            return new ResponseEntity(taskDTO, HttpStatus.OK);
//        }
//        return new ResponseEntity("Cannot find task with given id", HttpStatus.NOT_FOUND);
        try {
            optional.ifPresentOrElse(
                    (task -> {
                        task.setDescription(taskDTO.getDescription());
                        task.setPriority(taskDTO.getPriority());
                        repository.save(task);
                    }),
                    () -> {
                        throw new RuntimeException("task not found");
                    }
            );
        } catch (RuntimeException e) {
            return new ResponseEntity("Cannot find task with given id", HttpStatus.NOT_FOUND);
        }

        errorMessage.setMessage("Task description is required");
        errorMessage.setStatus(400);

        return new ResponseEntity(taskDTO, HttpStatus.OK);
    }
}
