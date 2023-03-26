section	.text
   global _start         ;must be declared for linker (ld)
	
_start:	                 ;tells linker entry point
   mov	edx,len_name     ;message length
   mov	ecx,name         ;message to write
   mov	ebx,1            ;file descriptor (stdout)
   mov	eax,4            ;system call number (sys_write)
   int	0x80             ;call kernel

   mov   edx,len_course  ;message length
   mov   ecx,course      ;message to write
   mov   ebx,1           ;file descriptor (stdout)
   mov   eax,4           ;system call number (sys_write)
   int   0x80            ;call kernel

   mov   edx,len_year    ;message length
   mov   ecx,year        ;message to write
   mov   ebx,1           ;file descriptor (stdout)
   mov   eax,4           ;system call number (sys_write)
   int   0x80            ;call kernel

   mov   edx,len_motto   ;message length
   mov   ecx,motto       ;message to write
   mov   ebx,1           ;file descriptor (stdout)
   mov   eax,4           ;system call number (sys_write)
   int   0x80            ;call kernel
	
   mov	eax,1            ;system call number (sys_exit)
   int	0x80             ;call kernel

section	.data
name db 'Name: Abdulsalam Alaraj', 0xa     ;name string to be printed
len_name equ $ - name                      ;length of the string

course db 'Course: Computer science', 0xa  ;course string to be printed
len_course equ $ - course                  ;length of the string

year db 'Year: 3', 0xa                     ;year string to be printed
len_year equ $ - year                      ;length of the string

motto db 'Motto: Live and let live', 0xa   ;motto string to be printed
len_motto equ $ - motto                    ;length of the string