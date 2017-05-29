package GC;

/**
 * Created by suyufeng on 17-5-29.
 */
public class SystemFunction {
    public void out() {
        System.out.println("getInt.0:");
        System.out.println("	push rbp");
        System.out.println("	mov rbp,rsp");
        System.out.println("	mov rdi,qword[rbp + 16]");
        System.out.println("	mov rax,0");
        System.out.println("	mov rdi,format1");
        System.out.println("	mov rsi,intbuffer");
        System.out.println("	call scanf");
        System.out.println("	mov rax,[intbuffer]");
        System.out.println("	mov rsp,rbp");
        System.out.println("	pop rbp");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("printInt.0:");
        System.out.println("	push rbp");
        System.out.println("	mov rbp,rsp");
        System.out.println("	mov rdi,qword[rbp + 16]");
        System.out.println("	mov rsi,rdi");
        System.out.println("	mov rax,0");
        System.out.println("	mov rdi,format2");
        System.out.println("	call printf");
        System.out.println("	mov rsp,rbp");
        System.out.println("	pop rbp");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("size.0:");
        System.out.println("	mov rdi,qword[rbp + 8]");
        System.out.println("	mov rax,[rdi-8]");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("print.0:");
        System.out.println("	push rbp");
        System.out.println("	mov rbp,rsp");
        System.out.println("	mov rdi,qword[rbp + 16]");
        System.out.println("	mov rax,0");
        System.out.println("	mov rsi,rdi");
        System.out.println("	mov rdi,format3");
        System.out.println("	call printf");
        System.out.println("	mov rsp,rbp");
        System.out.println("	pop rbp");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("println.0:");
        System.out.println("	mov rdi,qword[rbp + 8]");
        System.out.println("	call puts");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("");
        System.out.println("transtring.1:");
        System.out.println("");
        System.out.println("	push rbp");
        System.out.println("	mov rbp,rsp");
        System.out.println("	call strlen");
        System.out.println("	push rdi");
        System.out.println("	mov rdi,rax");
        System.out.println("	push rdi");
        System.out.println("	add rdi,9");
        System.out.println("	call malloc");
        System.out.println("	pop rdi");
        System.out.println("	mov [rax],rdi");
        System.out.println("	add rax,8");
        System.out.println("	mov rdx,rdi");
        System.out.println("	add rdx,1");
        System.out.println("	mov rdi,rax");
        System.out.println("	pop rsi");
        System.out.println("	sub rsp,8");
        System.out.println("	push rax");
        System.out.println("	call memcpy");
        System.out.println("	pop rax");
        System.out.println("	mov rsp,rbp");
        System.out.println("	pop rbp");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("getString.0:");
        System.out.println("	");
        System.out.println("	push rbp");
        System.out.println("	mov rbp,rsp");
        System.out.println("	mov rdi,qword[rbp + 16]");
        System.out.println("	mov rax,0");
        System.out.println("	mov rdi,format3");
        System.out.println("	mov rsi,stringbuffer");
        System.out.println("	call scanf");
        System.out.println("	mov rdi,stringbuffer");
        System.out.println("	call transtring.1");
        System.out.println("	mov rsp,rbp");
        System.out.println("	pop rbp");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("toString.0:");
        System.out.println("");
        System.out.println("	push rbp");
        System.out.println("	mov rbp,rsp");
        System.out.println("	mov rdi,qword[rbp + 16]");
        System.out.println("	mov rdx,rdi");
        System.out.println("	mov rax,0");
        System.out.println("	mov rdi,stringbuffer");
        System.out.println("	mov rsi,format1");
        System.out.println("	call sprintf");
        System.out.println("	mov rdi,stringbuffer");
        System.out.println("	call transtring.1");
        System.out.println("	mov rsp,rbp");
        System.out.println("	pop rbp");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("length.1:");
        System.out.println("	mov rdi,qword[rbp + 8]");
        System.out.println("	mov rax,[rdi-8]");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("substring.1:");
        System.out.println("");
        System.out.println("	push rbp");
        System.out.println("	mov rbp,rsp");
        System.out.println("	mov rdi,qword[rbp + 16]");
        System.out.println("	mov rsi,qword[rbp + 24]");
        System.out.println("	mov rdx,qword[rbp + 32]");
        System.out.println("	push rdi");
        System.out.println("	push rsi");
        System.out.println("	mov rdi,rdx");
        System.out.println("	sub rdi,rsi");
        System.out.println("	add rdi,1");
        System.out.println("	push rdi");
        System.out.println("	add rdi,9");
        System.out.println("	call malloc");
        System.out.println("	pop rdx");
        System.out.println("	mov [rax],rdx");
        System.out.println("	add rax,8");
        System.out.println("	pop rsi");
        System.out.println("	pop rdi");
        System.out.println("	add rsi,rdi");
        System.out.println("	mov rdi,rax");
        System.out.println("	push rdx");
        System.out.println("	push rax");
        System.out.println("	call memcpy");
        System.out.println("	pop rax");
        System.out.println("	pop rdx");
        System.out.println("	mov qword[rax+rdx],0");
        System.out.println("	mov rsp,rbp");
        System.out.println("	pop rbp");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("parseInt.1:");
        System.out.println("	mov rdi,qword[rbp + 8]");
        System.out.println("	mov rsi,format1");
        System.out.println("	mov rdx,intbuffer");
        System.out.println("	mov rax,0");
        System.out.println("	call sscanf");
        System.out.println("	mov rax,[intbuffer]");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("ord.1:");
        System.out.println("	");
        System.out.println("	mov rdi,qword[rbp + 8]");
        System.out.println("	mov rsi,qword[rbp + 16]");
        System.out.println("	mov rax,0");
        System.out.println("	mov al,byte[rdi+rsi]");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("Sadd.0:");
        System.out.println("	");
        System.out.println("	push rbp");
        System.out.println("	mov rbp,rsp");
        System.out.println("	mov rdi,qword[rbp + 16]");
        System.out.println("	mov rsi,qword[rbp + 24]");
        System.out.println("	push rsi");
        System.out.println("	mov rsi,rdi");
        System.out.println("	mov rdi,stringbuffer");
        System.out.println("	mov rdx,[rsi-8]");
        System.out.println("	push rdx");
        System.out.println("	call memcpy");
        System.out.println("	pop rdi");
        System.out.println("	pop rsi");
        System.out.println("	add rdi,stringbuffer");
        System.out.println("	mov rdx,[rsi-8]");
        System.out.println("	add rdx,1");
        System.out.println("	call memcpy");
        System.out.println("	mov rdi,stringbuffer");
        System.out.println("	call transtring.1");
        System.out.println("	mov rsp,rbp");
        System.out.println("	pop rbp");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("Slt.0:");
        System.out.println("	");
        System.out.println("	push rbp");
        System.out.println("	mov rbp,rsp");
        System.out.println("	mov rdi,qword[rbp + 16]");
        System.out.println("	mov rsi,qword[rbp + 24]");
        System.out.println("	call strcmp");
        System.out.println("	mov rdi,0");
        System.out.println("	cmp rax,0");
        System.out.println("	setl dil");
        System.out.println("	mov rax,rdi");
        System.out.println("	mov rsp,rbp");
        System.out.println("	pop rbp");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("Sle.0:");
        System.out.println("");
        System.out.println("	push rbp");
        System.out.println("	mov rbp,rsp");
        System.out.println("	mov rdi,qword[rbp + 16]");
        System.out.println("	mov rsi,qword[rbp + 24]");
        System.out.println("	call strcmp");
        System.out.println("	mov rdi,0");
        System.out.println("	cmp rax,0");
        System.out.println("	setle dil");
        System.out.println("	mov rax,rdi");
        System.out.println("	mov rsp,rbp");
        System.out.println("	pop rbp");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("Sgt.0:");
        System.out.println("");
        System.out.println("	push rbp");
        System.out.println("	mov rbp,rsp");
        System.out.println("	mov rdi,qword[rbp + 16]");
        System.out.println("	mov rsi,qword[rbp + 24]");
        System.out.println("	call strcmp");
        System.out.println("	mov rdi,0");
        System.out.println("	cmp rax,0");
        System.out.println("	setg dil");
        System.out.println("	mov rax,rdi");
        System.out.println("	mov rsp,rbp");
        System.out.println("	pop rbp");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("Sge.0:");
        System.out.println("");
        System.out.println("	push rbp");
        System.out.println("	mov rbp,rsp");
        System.out.println("	mov rdi,qword[rbp + 16]");
        System.out.println("	mov rsi,qword[rbp + 24]");
        System.out.println("	call strcmp");
        System.out.println("	mov rdi,0");
        System.out.println("	cmp rax,0");
        System.out.println("	setge dil");
        System.out.println("	mov rax,rdi");
        System.out.println("	mov rsp,rbp");
        System.out.println("	pop rbp");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("Seq.0:");
        System.out.println("");
        System.out.println("	push rbp");
        System.out.println("	mov rbp,rsp");
        System.out.println("	mov rdi,qword[rbp + 16]");
        System.out.println("	mov rsi,qword[rbp + 24]");
        System.out.println("	call strcmp");
        System.out.println("	mov rdi,0");
        System.out.println("	cmp rax,0");
        System.out.println("	sete dil");
        System.out.println("	mov rax,rdi");
        System.out.println("	mov rsp,rbp");
        System.out.println("	pop rbp");
        System.out.println("	ret");
        System.out.println("");
        System.out.println("Sne.0:");
        System.out.println("");
        System.out.println("	push rbp");
        System.out.println("	mov rbp,rsp");
        System.out.println("	mov rdi,qword[rbp + 16]");
        System.out.println("	mov rsi,qword[rbp + 24]");
        System.out.println("	call strcmp");
        System.out.println("	mov rdi,0");
        System.out.println("	cmp rax,0");
        System.out.println("	setne dil");
        System.out.println("	mov rax,rdi");
        System.out.println("	mov rsp,rbp");
        System.out.println("	pop rbp");
        System.out.println("	ret");
    }
}
