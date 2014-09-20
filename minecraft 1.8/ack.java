/*   1:    */ class ack
/*   2:    */   extends zn
/*   3:    */ {
/*   4:    */   private final acb c;
/*   5:    */   private boolean d;
/*   6:506 */   private boolean e = false;
/*   7:    */   
/*   8:    */   public ack(acb paramacb)
/*   9:    */   {
/*  10:509 */     super(paramacb, 0.699999988079071D, 16);
/*  11:510 */     this.c = paramacb;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public boolean a()
/*  15:    */   {
/*  16:515 */     if (this.a <= 0)
/*  17:    */     {
/*  18:516 */       if (!this.c.o.Q().b("mobGriefing")) {
/*  19:517 */         return false;
/*  20:    */       }
/*  21:521 */       this.e = false;
/*  22:522 */       this.d = acb.a(this.c);
/*  23:    */     }
/*  24:525 */     return super.a();
/*  25:    */   }
/*  26:    */   
/*  27:    */   public boolean b()
/*  28:    */   {
/*  29:530 */     return (this.e) && (super.b());
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void c()
/*  33:    */   {
/*  34:535 */     super.c();
/*  35:    */   }
/*  36:    */   
/*  37:    */   public void d()
/*  38:    */   {
/*  39:540 */     super.d();
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void e()
/*  43:    */   {
/*  44:545 */     super.e();
/*  45:    */     
/*  46:547 */     this.c.p().a(this.b.n() + 0.5D, this.b.o() + 1, this.b.p() + 0.5D, 10.0F, this.c.bP());
/*  47:549 */     if (f())
/*  48:    */     {
/*  49:550 */       aqu localaqu = this.c.o;
/*  50:551 */       dt localdt = this.b.a();
/*  51:    */       
/*  52:553 */       bec localbec = localaqu.p(localdt);
/*  53:554 */       atr localatr = localbec.c();
/*  54:556 */       if ((this.e) && ((localatr instanceof auh)) && (((Integer)localbec.b(auh.a)).intValue() == 7))
/*  55:    */       {
/*  56:557 */         localaqu.a(localdt, aty.a.P(), 2);
/*  57:558 */         localaqu.b(localdt, true);
/*  58:559 */         this.c.cn();
/*  59:    */       }
/*  60:562 */       this.e = false;
/*  61:    */       
/*  62:    */ 
/*  63:565 */       this.a = 10;
/*  64:    */     }
/*  65:    */   }
/*  66:    */   
/*  67:    */   protected boolean a(aqu paramaqu, dt paramdt)
/*  68:    */   {
/*  69:571 */     atr localatr = paramaqu.p(paramdt).c();
/*  70:573 */     if (localatr == aty.ak)
/*  71:    */     {
/*  72:574 */       paramdt = paramdt.a();
/*  73:575 */       bec localbec = paramaqu.p(paramdt);
/*  74:576 */       localatr = localbec.c();
/*  75:578 */       if (((localatr instanceof auh)) && (((Integer)localbec.b(auh.a)).intValue() == 7) && (this.d) && (!this.e))
/*  76:    */       {
/*  77:579 */         this.e = true;
/*  78:580 */         return true;
/*  79:    */       }
/*  80:    */     }
/*  81:583 */     return false;
/*  82:    */   }
/*  83:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ack
 * JD-Core Version:    0.7.0.1
 */