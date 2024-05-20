// In this project you will create a simple image watermarking algorithms using a least significant bit (LSB) substitution. This simple algorithm in SCILAB should be able to accept and manipulate an image and cover it with watermarked image.


clc
clear
close

function [N] = nume1(X)
    [m,n]=size(X);
    N=m*n;
endfunction

function [psnr, mse, maxerr] = psnr_mse_maxerr(X, Xapp)
    X = double(X);
    Xapp = double(Xapp);
    absD = abs(X - Xapp);
    A = absD.^2;
    mse = sum(A(:)) / nume1(X);
    psnr = 10 * log10(255 * 255 / mse);
    maxerr = round(max(absD(:)));
endfunction

function [A] = gray2bin(B)
    [m,n] = size(B);
    A = zeros(m,n);
    for i = 1:m
        for j = 1:n
            if (B(i,j) > 200)
                A(i,j) = 1;
            else
                A(i,j) = 0;
            end
        end
    end
endfunction

function [c]=bit_set(c,b)
    [m,n]=size(c);
    for i=1:m
        for j=1:n
            c(i,j) = bitset(c(i,j), 1, b(i,j));
        end
    end
endfunction


function [d] = bit_get(c)
    [m,n] = size(c);
    d = zeros(m,n);
    for i = 1:m
        for j = 1:n
            d(i,j) = bitget(c(i,j), 1);
        end
    end
endfunction


a=imread("/Users/abdulsalam/Desktop/original.jpg");
b=imread("/Users/abdulsalam/Desktop/watermark.jpg");

b=gray2bin(b);
[m,n]=size(a);
a=double(a);

c=a;
c=bit_set(c,b);
d=bit_get(c);


figure;
imshow(uint8(a));
title("Original image");

figure;
imshow(uint8(b * 255));
title("Watermark image");

figure;
imshow(uint8(d * 255));
title("Extracted watermark");

psnr=psnr_mse_maxerr(a,c);
correlation=corr2(b,d);
disp(correlation,"correlation between watermark image and extracted watermark=")


