package br.cp.utfpr;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.*;
import static org.mockito.Mockito.*;

public class UsuarioValidatorTest {
    
    UsuarioValidator usuarioValidator;
    UsuarioDAO usuarioDAO;
    Usuario usuario;
    SenhaValidator senhaValidator;
    
    public UsuarioValidatorTest() {
        senhaValidator = Mockito.mock(SenhaValidator.class);
        usuario = Mockito.mock(Usuario.class);
        usuarioDAO = Mockito.mock(UsuarioDAO.class);
        usuarioValidator = new UsuarioValidator(usuarioDAO);
        usuarioValidator.setSenhaValidator(senhaValidator);
    }

    @Test(expected = Exception.class)
    public void NomeMenor5() throws Exception {
        when(usuario.getNome()).thenReturn("asd");
        usuarioValidator.ehUsuarioValido(usuario);
    }
    
    @Test(expected = Exception.class)
    public void SenhasDiferentes() throws Exception {
        when(usuario.getNome()).thenReturn("asdddd");
        
        when(usuario.getSenha()).thenReturn("asd");
        when(usuario.getSenhaConfirmada()).thenReturn("asdd");
        
        usuarioValidator.ehUsuarioValido(usuario);
        
    }
    
    @Test(expected = Exception.class)
    public void SenhaValidator() throws Exception {
        when(usuario.getNome()).thenReturn("asdddd");
        when(usuario.getSenha()).thenReturn("asd");
        when(usuario.getSenhaConfirmada()).thenReturn("asd");
        
        when(senhaValidator.verificar("asd")).thenReturn(true);
        
        usuarioValidator.ehUsuarioValido(usuario);
    }
    
    @Test(expected = Exception.class)
    public void UsuarioExistente() throws Exception {
        when(usuario.getNome()).thenReturn("asdddd");
        when(usuario.getSenha()).thenReturn("asd");
        when(usuario.getSenhaConfirmada()).thenReturn("asd");
        
        when(senhaValidator.verificar("asd")).thenReturn(false);
        
        when(usuarioDAO.getByName("asdddd")).thenReturn(usuario);
        
        usuarioValidator.ehUsuarioValido(usuario);
    }
    
    @Test
    public void NomeUsuarioInvalido1() throws Exception {
        when(usuario.getNome()).thenReturn("asd ddd");
        when(usuario.getSenha()).thenReturn("asd");
        when(usuario.getSenhaConfirmada()).thenReturn("asd");
        
        when(senhaValidator.verificar("asd")).thenReturn(false);
        
        when(usuarioDAO.getByName("asdddd")).thenReturn(null);
        
        boolean response = usuarioValidator.ehUsuarioValido(usuario);
        
        assertFalse(response);
    }
    
    @Test
    public void NomeUsuarioInvalido2() throws Exception {
        when(usuario.getNome()).thenReturn("asd2 cxcx");
        when(usuario.getSenha()).thenReturn("asd");
        when(usuario.getSenhaConfirmada()).thenReturn("asd");
        
        when(senhaValidator.verificar("asd")).thenReturn(false);
        
        when(usuarioDAO.getByName("asdddd")).thenReturn(null);
        
        boolean response = usuarioValidator.ehUsuarioValido(usuario);
        
        assertFalse(response);
    }
    
    
    
    @Test
    public void UsuarioValido() throws Exception {
        when(usuario.getNome()).thenReturn("asdddd");
        when(usuario.getSenha()).thenReturn("asd");
        when(usuario.getSenhaConfirmada()).thenReturn("asd");
        
        when(senhaValidator.verificar("asd")).thenReturn(false);
        
        when(usuarioDAO.getByName("asdddd")).thenReturn(null);
        
        boolean response = usuarioValidator.ehUsuarioValido(usuario);
        
        assertTrue(response);

    }
}
