package org.home.productivity.todo.model;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import org.home.productivity.todo.model.spec.AbstractEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Todo extends AbstractEntity {

    private String description;
    private boolean complete;
    private LocalDateTime dueDateTime;

    @OneToMany(mappedBy = "todo")
    private Set<Comment> comments;

    @OneToMany(mappedBy = "todo")
    private Set<CheckListItem> checkListItems;

}
