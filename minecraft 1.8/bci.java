/*   1:    */ import com.google.common.collect.Lists;
/*   2:    */ import java.util.List;
/*   3:    */ 
/*   4:    */ public class bci
/*   5:    */   extends bcm
/*   6:    */ {
/*   7:    */   private int a;
/*   8:    */   private fv f;
/*   9:    */   private boolean g;
/*  10:    */   private List h;
/*  11:    */   private List i;
/*  12:    */   private String j;
/*  13:    */   
/*  14:    */   public void a(amj paramamj)
/*  15:    */   {
/*  16:266 */     this.f = null;
/*  17:267 */     if ((paramamj.n()) && (paramamj.o().b("BlockEntityTag", 10)))
/*  18:    */     {
/*  19:268 */       fn localfn = paramamj.o().m("BlockEntityTag");
/*  20:269 */       if (localfn.c("Patterns")) {
/*  21:270 */         this.f = ((fv)localfn.c("Patterns", 10).b());
/*  22:    */       }
/*  23:272 */       if (localfn.b("Base", 99)) {
/*  24:273 */         this.a = localfn.f("Base");
/*  25:    */       } else {
/*  26:275 */         this.a = (paramamj.i() & 0xF);
/*  27:    */       }
/*  28:    */     }
/*  29:    */     else
/*  30:    */     {
/*  31:278 */       this.a = (paramamj.i() & 0xF);
/*  32:    */     }
/*  33:280 */     this.h = null;
/*  34:281 */     this.i = null;
/*  35:282 */     this.j = "";
/*  36:283 */     this.g = true;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public void b(fn paramfn)
/*  40:    */   {
/*  41:288 */     super.b(paramfn);
/*  42:    */     
/*  43:290 */     paramfn.a("Base", this.a);
/*  44:291 */     if (this.f != null) {
/*  45:292 */       paramfn.a("Patterns", this.f);
/*  46:    */     }
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void a(fn paramfn)
/*  50:    */   {
/*  51:298 */     super.a(paramfn);
/*  52:    */     
/*  53:300 */     this.a = paramfn.f("Base");
/*  54:301 */     this.f = paramfn.c("Patterns", 10);
/*  55:    */     
/*  56:303 */     this.h = null;
/*  57:304 */     this.i = null;
/*  58:305 */     this.j = null;
/*  59:306 */     this.g = true;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public id x_()
/*  63:    */   {
/*  64:311 */     fn localfn = new fn();
/*  65:312 */     b(localfn);
/*  66:313 */     return new iu(this.c, 6, localfn);
/*  67:    */   }
/*  68:    */   
/*  69:    */   public int b()
/*  70:    */   {
/*  71:317 */     return this.a;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public static int b(amj paramamj)
/*  75:    */   {
/*  76:322 */     fn localfn = paramamj.a("BlockEntityTag", false);
/*  77:323 */     if ((localfn != null) && (localfn.c("Base"))) {
/*  78:324 */       return localfn.f("Base");
/*  79:    */     }
/*  80:326 */     return paramamj.i();
/*  81:    */   }
/*  82:    */   
/*  83:    */   public static int c(amj paramamj)
/*  84:    */   {
/*  85:330 */     fn localfn = paramamj.a("BlockEntityTag", false);
/*  86:331 */     if ((localfn != null) && (localfn.c("Patterns"))) {
/*  87:332 */       return localfn.c("Patterns", 10).c();
/*  88:    */     }
/*  89:334 */     return 0;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public List c()
/*  93:    */   {
/*  94:338 */     g();
/*  95:339 */     return this.h;
/*  96:    */   }
/*  97:    */   
/*  98:    */   public List d()
/*  99:    */   {
/* 100:343 */     g();
/* 101:344 */     return this.i;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String e()
/* 105:    */   {
/* 106:348 */     g();
/* 107:349 */     return this.j;
/* 108:    */   }
/* 109:    */   
/* 110:    */   private void g()
/* 111:    */   {
/* 112:353 */     if ((this.h != null) && (this.i != null) && (this.j != null)) {
/* 113:354 */       return;
/* 114:    */     }
/* 115:356 */     if (!this.g)
/* 116:    */     {
/* 117:357 */       this.j = "";
/* 118:358 */       return;
/* 119:    */     }
/* 120:361 */     this.h = Lists.newArrayList();
/* 121:362 */     this.i = Lists.newArrayList();
/* 122:    */     
/* 123:    */ 
/* 124:365 */     this.h.add(bcj.a);
/* 125:366 */     this.i.add(akv.a(this.a));
/* 126:367 */     this.j = ("b" + this.a);
/* 127:369 */     if (this.f != null) {
/* 128:370 */       for (int k = 0; k < this.f.c(); k++)
/* 129:    */       {
/* 130:371 */         fn localfn = this.f.b(k);
/* 131:372 */         bcj localbcj = bcj.a(localfn.j("Pattern"));
/* 132:373 */         if (localbcj != null)
/* 133:    */         {
/* 134:374 */           this.h.add(localbcj);
/* 135:375 */           int m = localfn.f("Color");
/* 136:376 */           this.i.add(akv.a(m));
/* 137:    */           
/* 138:378 */           this.j = (this.j + localbcj.b() + m);
/* 139:    */         }
/* 140:    */       }
/* 141:    */     }
/* 142:    */   }
/* 143:    */   
/* 144:    */   public static void e(amj paramamj)
/* 145:    */   {
/* 146:415 */     fn localfn = paramamj.a("BlockEntityTag", false);
/* 147:416 */     if ((localfn == null) || (!localfn.b("Patterns", 9))) {
/* 148:417 */       return;
/* 149:    */     }
/* 150:420 */     fv localfv = localfn.c("Patterns", 10);
/* 151:421 */     if (localfv.c() <= 0) {
/* 152:422 */       return;
/* 153:    */     }
/* 154:424 */     localfv.a(localfv.c() - 1);
/* 155:426 */     if (localfv.c_())
/* 156:    */     {
/* 157:427 */       paramamj.o().o("BlockEntityTag");
/* 158:428 */       if (paramamj.o().c_()) {
/* 159:429 */         paramamj.d(null);
/* 160:    */       }
/* 161:    */     }
/* 162:    */   }
/* 163:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bci
 * JD-Core Version:    0.7.0.1
 */