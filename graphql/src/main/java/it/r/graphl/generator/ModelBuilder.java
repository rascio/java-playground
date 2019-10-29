package it.r.graphl.generator;

import static graphql.Scalars.GraphQLString;
import static graphql.schema.GraphQLFieldDefinition.newFieldDefinition;
import graphql.schema.GraphQLObjectType;
import static graphql.schema.GraphQLObjectType.newObject;
import graphql.schema.idl.SchemaPrinter;

public class ModelBuilder {

    public static void main(String[] args) {
        GraphQLObjectType fooType = newObject()
                .name("Foo")
                .field(newFieldDefinition()
                        .name("bar")
                        .type(GraphQLString))
                .build();


        System.out.println(new SchemaPrinter().print(fooType));
    }
}
