package com.alissao.colaborador_back_end.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegisterColaborador(@NotBlank
                                  @NotNull
                                  String name,
                                  @NotBlank
                                  @NotNull
                                  String senha,

                                  Long idSetor) {
}
