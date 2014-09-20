/*   1:    */ public abstract class ati
/*   2:    */   extends atr
/*   3:    */ {
/*   4:    */   protected final boolean a;
/*   5:    */   
/*   6:    */   public static boolean d(aqu paramaqu, dt paramdt)
/*   7:    */   {
/*   8:360 */     return d(paramaqu.p(paramdt));
/*   9:    */   }
/*  10:    */   
/*  11:    */   public static boolean d(bec parambec)
/*  12:    */   {
/*  13:364 */     atr localatr = parambec.c();
/*  14:365 */     return (localatr == aty.av) || (localatr == aty.D) || (localatr == aty.E) || (localatr == aty.cs);
/*  15:    */   }
/*  16:    */   
/*  17:    */   protected ati(boolean paramBoolean)
/*  18:    */   {
/*  19:369 */     super(bof.q);
/*  20:370 */     this.a = paramBoolean;
/*  21:371 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*  22:372 */     a(akf.e);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  26:    */   {
/*  27:382 */     return null;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public boolean c()
/*  31:    */   {
/*  32:387 */     return false;
/*  33:    */   }
/*  34:    */   
/*  35:    */   public bru a(aqu paramaqu, dt paramdt, brw parambrw1, brw parambrw2)
/*  36:    */   {
/*  37:392 */     a(paramaqu, paramdt);
/*  38:393 */     return super.a(paramaqu, paramdt, parambrw1, parambrw2);
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void a(ard paramard, dt paramdt)
/*  42:    */   {
/*  43:398 */     bec localbec = paramard.p(paramdt);
/*  44:399 */     Object localObject = localbec.c() == this ? (atl)localbec.b(l()) : null;
/*  45:400 */     if ((localObject != null) && (localObject.c())) {
/*  46:401 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
/*  47:    */     } else {
/*  48:403 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
/*  49:    */     }
/*  50:    */   }
/*  51:    */   
/*  52:    */   public boolean d()
/*  53:    */   {
/*  54:409 */     return false;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public boolean c(aqu paramaqu, dt paramdt)
/*  58:    */   {
/*  59:414 */     if (aqu.a(paramaqu, paramdt.b())) {
/*  60:415 */       return true;
/*  61:    */     }
/*  62:417 */     return false;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public void c(aqu paramaqu, dt paramdt, bec parambec)
/*  66:    */   {
/*  67:422 */     if (!paramaqu.D)
/*  68:    */     {
/*  69:423 */       parambec = a(paramaqu, paramdt, parambec, true);
/*  70:425 */       if (this.a) {
/*  71:426 */         a(paramaqu, paramdt, parambec, this);
/*  72:    */       }
/*  73:    */     }
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  77:    */   {
/*  78:433 */     if (paramaqu.D) {
/*  79:434 */       return;
/*  80:    */     }
/*  81:437 */     atl localatl = (atl)parambec.b(l());
/*  82:438 */     int i = 0;
/*  83:440 */     if (!aqu.a(paramaqu, paramdt.b())) {
/*  84:441 */       i = 1;
/*  85:    */     }
/*  86:443 */     if ((localatl == atl.c) && (!aqu.a(paramaqu, paramdt.f()))) {
/*  87:444 */       i = 1;
/*  88:445 */     } else if ((localatl == atl.d) && (!aqu.a(paramaqu, paramdt.e()))) {
/*  89:446 */       i = 1;
/*  90:447 */     } else if ((localatl == atl.e) && (!aqu.a(paramaqu, paramdt.c()))) {
/*  91:448 */       i = 1;
/*  92:449 */     } else if ((localatl == atl.f) && (!aqu.a(paramaqu, paramdt.d()))) {
/*  93:450 */       i = 1;
/*  94:    */     }
/*  95:453 */     if (i != 0)
/*  96:    */     {
/*  97:454 */       b(paramaqu, paramdt, parambec, 0);
/*  98:455 */       paramaqu.g(paramdt);
/*  99:    */     }
/* 100:    */     else
/* 101:    */     {
/* 102:457 */       b(paramaqu, paramdt, parambec, paramatr);
/* 103:    */     }
/* 104:    */   }
/* 105:    */   
/* 106:    */   protected void b(aqu paramaqu, dt paramdt, bec parambec, atr paramatr) {}
/* 107:    */   
/* 108:    */   protected bec a(aqu paramaqu, dt paramdt, bec parambec, boolean paramBoolean)
/* 109:    */   {
/* 110:465 */     if (paramaqu.D) {
/* 111:466 */       return parambec;
/* 112:    */     }
/* 113:468 */     return new atk(this, paramaqu, paramdt, parambec).a(paramaqu.z(paramdt), paramBoolean).b();
/* 114:    */   }
/* 115:    */   
/* 116:    */   public int i()
/* 117:    */   {
/* 118:473 */     return 0;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public aql k()
/* 122:    */   {
/* 123:478 */     return aql.c;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public void b(aqu paramaqu, dt paramdt, bec parambec)
/* 127:    */   {
/* 128:483 */     super.b(paramaqu, paramdt, parambec);
/* 129:485 */     if (((atl)parambec.b(l())).c()) {
/* 130:486 */       paramaqu.c(paramdt.a(), this);
/* 131:    */     }
/* 132:489 */     if (this.a)
/* 133:    */     {
/* 134:490 */       paramaqu.c(paramdt, this);
/* 135:491 */       paramaqu.c(paramdt.b(), this);
/* 136:    */     }
/* 137:    */   }
/* 138:    */   
/* 139:    */   public abstract bex l();
/* 140:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ati
 * JD-Core Version:    0.7.0.1
 */