/*   1:    */ public class ayz
/*   2:    */ {
/*   3:    */   private final aqu a;
/*   4:    */   private final el b;
/*   5:    */   private final ej c;
/*   6:    */   private final ej d;
/*   7:242 */   private int e = 0;
/*   8:    */   private dt f;
/*   9:    */   private int g;
/*  10:    */   private int h;
/*  11:    */   
/*  12:    */   public ayz(aqu paramaqu, dt paramdt, el paramel)
/*  13:    */   {
/*  14:248 */     this.a = paramaqu;
/*  15:249 */     this.b = paramel;
/*  16:250 */     if (paramel == el.a)
/*  17:    */     {
/*  18:251 */       this.d = ej.f;
/*  19:252 */       this.c = ej.e;
/*  20:    */     }
/*  21:    */     else
/*  22:    */     {
/*  23:255 */       this.d = ej.c;
/*  24:256 */       this.c = ej.d;
/*  25:    */     }
/*  26:259 */     dt localdt = paramdt;
/*  27:260 */     while ((paramdt.o() > localdt.o() - 21) && (paramdt.o() > 0) && (a(paramaqu.p(paramdt.b()).c()))) {
/*  28:261 */       paramdt = paramdt.b();
/*  29:    */     }
/*  30:264 */     int i = a(paramdt, this.d) - 1;
/*  31:266 */     if (i >= 0)
/*  32:    */     {
/*  33:267 */       this.f = paramdt.a(this.d, i);
/*  34:    */       
/*  35:269 */       this.h = a(this.f, this.c);
/*  36:271 */       if ((this.h < 2) || (this.h > 21))
/*  37:    */       {
/*  38:272 */         this.f = null;
/*  39:273 */         this.h = 0;
/*  40:    */       }
/*  41:    */     }
/*  42:277 */     if (this.f != null) {
/*  43:278 */       this.g = a();
/*  44:    */     }
/*  45:    */   }
/*  46:    */   
/*  47:    */   protected int a(dt paramdt, ej paramej)
/*  48:    */   {
/*  49:284 */     for (int i = 0; i < 22; i++)
/*  50:    */     {
/*  51:285 */       localObject = paramdt.a(paramej, i);
/*  52:286 */       if (!a(this.a.p((dt)localObject).c())) {
/*  53:    */         break;
/*  54:    */       }
/*  55:290 */       if (this.a.p(((dt)localObject).b()).c() != aty.Z) {
/*  56:    */         break;
/*  57:    */       }
/*  58:    */     }
/*  59:295 */     Object localObject = this.a.p(paramdt.a(paramej, i)).c();
/*  60:296 */     if (localObject == aty.Z) {
/*  61:297 */       return i;
/*  62:    */     }
/*  63:300 */     return 0;
/*  64:    */   }
/*  65:    */   
/*  66:    */   protected int a()
/*  67:    */   {
/*  68:304 */     for (this.g = 0; this.g < 21; this.g += 1) {
/*  69:305 */       for (i = 0; i < this.h; i++)
/*  70:    */       {
/*  71:306 */         dt localdt = this.f.a(this.c, i).b(this.g);
/*  72:    */         
/*  73:308 */         atr localatr = this.a.p(localdt).c();
/*  74:309 */         if (!a(localatr)) {
/*  75:    */           break label181;
/*  76:    */         }
/*  77:313 */         if (localatr == aty.aY) {
/*  78:314 */           this.e += 1;
/*  79:    */         }
/*  80:317 */         if (i == 0)
/*  81:    */         {
/*  82:318 */           localatr = this.a.p(localdt.a(this.d)).c();
/*  83:319 */           if (localatr != aty.Z) {
/*  84:    */             break label181;
/*  85:    */           }
/*  86:    */         }
/*  87:322 */         else if (i == this.h - 1)
/*  88:    */         {
/*  89:323 */           localatr = this.a.p(localdt.a(this.c)).c();
/*  90:324 */           if (localatr != aty.Z) {
/*  91:    */             break label181;
/*  92:    */           }
/*  93:    */         }
/*  94:    */       }
/*  95:    */     }
/*  96:    */     label181:
/*  97:331 */     for (int i = 0; i < this.h; i++) {
/*  98:332 */       if (this.a.p(this.f.a(this.c, i).b(this.g)).c() != aty.Z)
/*  99:    */       {
/* 100:333 */         this.g = 0;
/* 101:334 */         break;
/* 102:    */       }
/* 103:    */     }
/* 104:338 */     if ((this.g > 21) || (this.g < 3))
/* 105:    */     {
/* 106:339 */       this.f = null;
/* 107:340 */       this.h = 0;
/* 108:341 */       this.g = 0;
/* 109:342 */       return 0;
/* 110:    */     }
/* 111:344 */     return this.g;
/* 112:    */   }
/* 113:    */   
/* 114:    */   protected boolean a(atr paramatr)
/* 115:    */   {
/* 116:349 */     return (paramatr.J == bof.a) || (paramatr == aty.ab) || (paramatr == aty.aY);
/* 117:    */   }
/* 118:    */   
/* 119:    */   public boolean b()
/* 120:    */   {
/* 121:353 */     return (this.f != null) && (this.h >= 2) && (this.h <= 21) && (this.g >= 3) && (this.g <= 21);
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void c()
/* 125:    */   {
/* 126:357 */     for (int i = 0; i < this.h; i++)
/* 127:    */     {
/* 128:358 */       dt localdt = this.f.a(this.c, i);
/* 129:359 */       for (int j = 0; j < this.g; j++) {
/* 130:360 */         this.a.a(localdt.b(j), aty.aY.P().a(ayy.a, this.b), 2);
/* 131:    */       }
/* 132:    */     }
/* 133:    */   }
/* 134:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ayz
 * JD-Core Version:    0.7.0.1
 */