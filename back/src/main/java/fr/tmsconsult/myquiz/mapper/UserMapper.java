package fr.tmsconsult.myquiz.mapper;



import fr.tmsconsult.myquiz.dto.UserDto;
import fr.tmsconsult.myquiz.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto toDto(User user);
    User toEntity(UserDto userDto);
}
