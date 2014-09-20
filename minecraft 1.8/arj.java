/*   1:    */ public class arj
/*   2:    */   implements ard
/*   3:    */ {
/*   4:    */   protected int a;
/*   5:    */   protected int b;
/*   6:    */   protected bfh[][] c;
/*   7:    */   protected boolean d;
/*   8:    */   protected aqu e;
/*   9:    */   
/*  10:    */   public arj(aqu paramaqu, dt paramdt1, dt paramdt2, int paramInt)
/*  11:    */   {
/*  12: 24 */     this.e = paramaqu;
/*  13:    */     
/*  14: 26 */     this.a = (paramdt1.n() - paramInt >> 4);
/*  15: 27 */     this.b = (paramdt1.p() - paramInt >> 4);
/*  16: 28 */     int i = paramdt2.n() + paramInt >> 4;
/*  17: 29 */     int j = paramdt2.p() + paramInt >> 4;
/*  18:    */     
/*  19: 31 */     this.c = new bfh[i - this.a + 1][j - this.b + 1];
/*  20:    */     
/*  21: 33 */     this.d = true;
/*  22:    */     int m;
/*  23: 34 */     for (int k = this.a; k <= i; k++) {
/*  24: 35 */       for (m = this.b; m <= j; m++) {
/*  25: 36 */         this.c[(k - this.a)][(m - this.b)] = paramaqu.a(k, m);
/*  26:    */       }
/*  27:    */     }
/*  28: 40 */     for (k = paramdt1.n() >> 4; k <= paramdt2.n() >> 4; k++) {
/*  29: 41 */       for (m = paramdt1.p() >> 4; m <= paramdt2.p() >> 4; m++)
/*  30:    */       {
/*  31: 42 */         bfh localbfh = this.c[(k - this.a)][(m - this.b)];
/*  32: 43 */         if ((localbfh != null) && 
/*  33: 44 */           (!localbfh.c(paramdt1.o(), paramdt2.o()))) {
/*  34: 45 */           this.d = false;
/*  35:    */         }
/*  36:    */       }
/*  37:    */     }
/*  38:    */   }
/*  39:    */   
/*  40:    */   public boolean W()
/*  41:    */   {
/*  42: 54 */     return this.d;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public bcm s(dt paramdt)
/*  46:    */   {
/*  47: 60 */     int i = (paramdt.n() >> 4) - this.a;
/*  48: 61 */     int j = (paramdt.p() >> 4) - this.b;
/*  49:    */     
/*  50: 63 */     return this.c[i][j].a(paramdt, bfl.a);
/*  51:    */   }
/*  52:    */   
/*  53:    */   public int b(dt paramdt, int paramInt)
/*  54:    */   {
/*  55: 77 */     int i = a(arf.a, paramdt);
/*  56: 78 */     int j = a(arf.b, paramdt);
/*  57: 79 */     if (j < paramInt) {
/*  58: 80 */       j = paramInt;
/*  59:    */     }
/*  60: 82 */     return i << 20 | j << 4;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public bec p(dt paramdt)
/*  64:    */   {
/*  65:134 */     if ((paramdt.o() >= 0) && 
/*  66:135 */       (paramdt.o() < 256))
/*  67:    */     {
/*  68:136 */       int i = (paramdt.n() >> 4) - this.a;
/*  69:137 */       int j = (paramdt.p() >> 4) - this.b;
/*  70:139 */       if ((i >= 0) && (i < this.c.length) && (j >= 0) && (j < this.c[i].length))
/*  71:    */       {
/*  72:140 */         bfh localbfh = this.c[i][j];
/*  73:141 */         if (localbfh != null) {
/*  74:142 */           return localbfh.g(paramdt);
/*  75:    */         }
/*  76:    */       }
/*  77:    */     }
/*  78:148 */     return aty.a.P();
/*  79:    */   }
/*  80:    */   
/*  81:    */   public arm b(dt paramdt)
/*  82:    */   {
/*  83:158 */     return this.e.b(paramdt);
/*  84:    */   }
/*  85:    */   
/*  86:    */   private int a(arf paramarf, dt paramdt)
/*  87:    */   {
/*  88:162 */     if ((paramarf == arf.a) && (this.e.t.o())) {
/*  89:163 */       return 0;
/*  90:    */     }
/*  91:165 */     if ((paramdt.o() < 0) || (paramdt.o() >= 256)) {
/*  92:166 */       return paramarf.c;
/*  93:    */     }
/*  94:169 */     if (p(paramdt).c().q())
/*  95:    */     {
/*  96:170 */       i = 0;
/*  97:171 */       for (ej localej : ej.values())
/*  98:    */       {
/*  99:172 */         int n = b(paramarf, paramdt.a(localej));
/* 100:173 */         if (n > i) {
/* 101:174 */           i = n;
/* 102:    */         }
/* 103:176 */         if (i >= 15) {
/* 104:177 */           return i;
/* 105:    */         }
/* 106:    */       }
/* 107:180 */       return i;
/* 108:    */     }
/* 109:183 */     int i = (paramdt.n() >> 4) - this.a;
/* 110:184 */     int j = (paramdt.p() >> 4) - this.b;
/* 111:    */     
/* 112:186 */     return this.c[i][j].a(paramarf, paramdt);
/* 113:    */   }
/* 114:    */   
/* 115:    */   public boolean d(dt paramdt)
/* 116:    */   {
/* 117:191 */     return p(paramdt).c().r() == bof.a;
/* 118:    */   }
/* 119:    */   
/* 120:    */   public int b(arf paramarf, dt paramdt)
/* 121:    */   {
/* 122:196 */     if ((paramdt.o() < 0) || (paramdt.o() >= 256)) {
/* 123:197 */       return paramarf.c;
/* 124:    */     }
/* 125:199 */     int i = (paramdt.n() >> 4) - this.a;
/* 126:200 */     int j = (paramdt.p() >> 4) - this.b;
/* 127:    */     
/* 128:202 */     return this.c[i][j].a(paramarf, paramdt);
/* 129:    */   }
/* 130:    */   
/* 131:    */   public int a(dt paramdt, ej paramej)
/* 132:    */   {
/* 133:212 */     bec localbec = p(paramdt);
/* 134:213 */     return localbec.c().b(this, paramdt, localbec, paramej);
/* 135:    */   }
/* 136:    */   
/* 137:    */   public are G()
/* 138:    */   {
/* 139:218 */     return this.e.G();
/* 140:    */   }
/* 141:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     arj
 * JD-Core Version:    0.7.0.1
 */