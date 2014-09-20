/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class abk
/*   5:    */ {
/*   6:    */   private aqu a;
/*   7:    */   private boolean b;
/*   8: 20 */   private int c = -1;
/*   9:    */   private int d;
/*  10:    */   private int e;
/*  11:    */   private abi f;
/*  12:    */   private int g;
/*  13:    */   private int h;
/*  14:    */   private int i;
/*  15:    */   
/*  16:    */   public abk(aqu paramaqu)
/*  17:    */   {
/*  18: 32 */     this.a = paramaqu;
/*  19:    */   }
/*  20:    */   
/*  21:    */   public void a()
/*  22:    */   {
/*  23: 42 */     if (this.a.w())
/*  24:    */     {
/*  25: 43 */       this.c = 0;
/*  26: 44 */       return;
/*  27:    */     }
/*  28: 47 */     if (this.c == 2) {
/*  29: 48 */       return;
/*  30:    */     }
/*  31: 51 */     if (this.c == 0)
/*  32:    */     {
/*  33: 52 */       float f1 = this.a.c(0.0F);
/*  34: 53 */       if ((f1 < 0.5D) || (f1 > 0.501D)) {
/*  35: 54 */         return;
/*  36:    */       }
/*  37: 56 */       this.c = (this.a.s.nextInt(10) == 0 ? 1 : 2);
/*  38: 57 */       this.b = false;
/*  39: 58 */       if (this.c == 2) {
/*  40: 59 */         return;
/*  41:    */       }
/*  42:    */     }
/*  43: 64 */     if (this.c == -1) {
/*  44: 65 */       return;
/*  45:    */     }
/*  46: 68 */     if (!this.b) {
/*  47: 69 */       if (b()) {
/*  48: 70 */         this.b = true;
/*  49:    */       } else {
/*  50: 72 */         return;
/*  51:    */       }
/*  52:    */     }
/*  53: 77 */     if (this.e > 0)
/*  54:    */     {
/*  55: 78 */       this.e -= 1;
/*  56: 79 */       return;
/*  57:    */     }
/*  58: 82 */     this.e = 2;
/*  59: 83 */     if (this.d > 0)
/*  60:    */     {
/*  61: 84 */       c();
/*  62: 85 */       this.d -= 1;
/*  63:    */     }
/*  64:    */     else
/*  65:    */     {
/*  66: 87 */       this.c = 2;
/*  67:    */     }
/*  68:    */   }
/*  69:    */   
/*  70:    */   private boolean b()
/*  71:    */   {
/*  72: 92 */     List localList = this.a.j;
/*  73: 93 */     for (ahd localahd : localList) {
/*  74: 94 */       if (!localahd.v())
/*  75:    */       {
/*  76: 95 */         this.f = this.a.ae().a(new dt(localahd), 1);
/*  77: 96 */         if ((this.f != null) && 
/*  78:    */         
/*  79:    */ 
/*  80: 99 */           (this.f.c() >= 10) && 
/*  81:    */           
/*  82:    */ 
/*  83:102 */           (this.f.d() >= 20) && 
/*  84:    */           
/*  85:    */ 
/*  86:105 */           (this.f.e() >= 20))
/*  87:    */         {
/*  88:110 */           dt localdt = this.f.a();
/*  89:111 */           float f1 = this.f.b();
/*  90:    */           
/*  91:113 */           int j = 0;
/*  92:114 */           for (int k = 0; k < 10; k++)
/*  93:    */           {
/*  94:115 */             float f2 = this.a.s.nextFloat() * 3.141593F * 2.0F;
/*  95:116 */             this.g = (localdt.n() + (int)(uv.b(f2) * f1 * 0.9D));
/*  96:117 */             this.h = localdt.o();
/*  97:118 */             this.i = (localdt.p() + (int)(uv.a(f2) * f1 * 0.9D));
/*  98:119 */             j = 0;
/*  99:120 */             for (abi localabi : this.a.ae().b()) {
/* 100:121 */               if (localabi != this.f) {
/* 101:124 */                 if (localabi.a(new dt(this.g, this.h, this.i)))
/* 102:    */                 {
/* 103:125 */                   j = 1;
/* 104:126 */                   break;
/* 105:    */                 }
/* 106:    */               }
/* 107:    */             }
/* 108:129 */             if (j == 0) {
/* 109:    */               break;
/* 110:    */             }
/* 111:    */           }
/* 112:133 */           if (j != 0) {
/* 113:134 */             return false;
/* 114:    */           }
/* 115:137 */           brw localbrw = a(new dt(this.g, this.h, this.i));
/* 116:138 */           if (localbrw != null)
/* 117:    */           {
/* 118:142 */             this.e = 0;
/* 119:143 */             this.d = 20;
/* 120:144 */             return true;
/* 121:    */           }
/* 122:    */         }
/* 123:    */       }
/* 124:    */     }
/* 125:147 */     return false;
/* 126:    */   }
/* 127:    */   
/* 128:    */   private boolean c()
/* 129:    */   {
/* 130:151 */     brw localbrw = a(new dt(this.g, this.h, this.i));
/* 131:152 */     if (localbrw == null) {
/* 132:153 */       return false;
/* 133:    */     }
/* 134:    */     agj localagj;
/* 135:    */     try
/* 136:    */     {
/* 137:157 */       localagj = new agj(this.a);
/* 138:158 */       localagj.a(this.a.E(new dt(localagj)), null);
/* 139:159 */       localagj.m(false);
/* 140:    */     }
/* 141:    */     catch (Exception localException)
/* 142:    */     {
/* 143:161 */       localException.printStackTrace();
/* 144:162 */       return false;
/* 145:    */     }
/* 146:164 */     localagj.b(localbrw.a, localbrw.b, localbrw.c, this.a.s.nextFloat() * 360.0F, 0.0F);
/* 147:165 */     this.a.d(localagj);
/* 148:166 */     dt localdt = this.f.a();
/* 149:167 */     localagj.a(localdt, this.f.b());
/* 150:168 */     return true;
/* 151:    */   }
/* 152:    */   
/* 153:    */   private brw a(dt paramdt)
/* 154:    */   {
/* 155:173 */     for (int j = 0; j < 10; j++)
/* 156:    */     {
/* 157:174 */       dt localdt = paramdt.a(this.a.s.nextInt(16) - 8, this.a.s.nextInt(6) - 3, this.a.s.nextInt(16) - 8);
/* 158:176 */       if (this.f.a(localdt)) {
/* 159:179 */         if (arg.a(xo.a, this.a, localdt)) {
/* 160:180 */           return new brw(localdt.n(), localdt.o(), localdt.p());
/* 161:    */         }
/* 162:    */       }
/* 163:    */     }
/* 164:183 */     return null;
/* 165:    */   }
/* 166:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     abk
 * JD-Core Version:    0.7.0.1
 */