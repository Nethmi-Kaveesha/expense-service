package lk.kavee.taskservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import lk.kavee.taskservice.entity.Expense;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
}