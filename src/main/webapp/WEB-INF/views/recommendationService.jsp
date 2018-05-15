<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<body id="page-top">
	<div class="container-wrapper">
		<div class="container">
			<!-- <div class="row">
				<div class="col-lg-12 text-center">
					<div class="section-title">
						<h3>추천 상품</h3>
						<p>사용자 데이터를 바탕으로 상품 추천</p>
					</div>
				</div>
			</div> -->
			<div class="row row-0-gutter">
				<!-- start portfolio item -->
				<div class="col-md-6 col-0-gutter">
					<c:if test="${!empty user }">
						<div>
							<h3>
								<span style="color: #DF01D7;"><strong>${user.name }</strong></span>님을위한추천상품입니다.
							</h3>
						</div>
					</c:if> 
					<div class="ot-portfolio-item">
						<figure class="effect-bubba">
							<img src="/resources/images/${category}/1.jpg" alt="img02"
								class="img-responsive" />
							<figcaption>
								<h2>Dean & Letter</h2>
								<p>Branding, Design</p>
								<a href="#" data-toggle="modal" data-target="#Modal-1">View
									more</a>
							</figcaption>
						</figure>
					</div>
				</div>
				<!-- end portfolio item -->
				<!-- start portfolio item -->
				<div class="col-md-6 col-0-gutter">
					<div class="ot-portfolio-item">
						<figure class="effect-bubba">
							<img src="/resources/images/${category}/2.jpg" alt="img02"
								class="img-responsive" />
							<figcaption>
								<h2>Startup Framework</h2>
								<p>Branding, Web Design</p>
								<a href="#" data-toggle="modal" data-target="#Modal-2">View
									more</a>
							</figcaption>
						</figure>
					</div>
				</div>
				<!-- end portfolio item -->
			</div>
			<div class="row row-0-gutter">
				<!-- start portfolio item -->
				<div class="col-md-6 col-0-gutter">
					<div class="ot-portfolio-item">
						<figure class="effect-bubba">
							<img src="/resources/images/${category}/3.jpg" alt="img02"
								class="img-responsive" />
							<figcaption>
								<h2>Lamp & Velvet</h2>
								<p>Branding, Web Design</p>
								<a href="#" data-toggle="modal" data-target="#Modal-3">View
									more</a>
							</figcaption>
						</figure>
					</div>
				</div>
				<!-- end portfolio item -->
				<!-- start portfolio item -->
				<div class="col-md-6 col-0-gutter">
					<div class="ot-portfolio-item">
						<figure class="effect-bubba">
							<img src="/resources/images/${category}/4.jpg" alt="img02"
								class="img-responsive" />
							<figcaption>
								<h2>Smart Name</h2>
								<p>Branding, Design</p>
								<a href="#" data-toggle="modal" data-target="#Modal-4">View
									more</a>
							</figcaption>
						</figure>
					</div>
				</div>
				<!-- end portfolio item -->
			</div>
			<div class="row row-0-gutter">
				<!-- start portfolio item -->
				<div class="col-md-6 col-0-gutter">
					<div class="ot-portfolio-item">
						<figure class="effect-bubba">
							<img src="/resources/images/${category}/5.jpg" alt="img02"
								class="img-responsive" />
							<figcaption>
								<h2>Fast People</h2>
								<p>Branding, Web Design</p>
								<a href="#" data-toggle="modal" data-target="#Modal-5">View
									more</a>
							</figcaption>
						</figure>
					</div>
				</div>
				<!-- end portfolio item -->
				<!-- start portfolio item -->
				<div class="col-md-6 col-0-gutter">
					<div class="ot-portfolio-item">
						<figure class="effect-bubba">
							<img src="/resources/images/${category}/6.jpg" alt="img02"
								class="img-responsive" />
							<figcaption>
								<h2>Kites & Stars</h2>
								<p>Branding, Web Design</p>
								<a href="#" data-toggle="modal" data-target="#Modal-6">View
									more</a>
							</figcaption>
						</figure>
					</div>
				</div>
				<!-- end portfolio item -->
			</div>
		</div>
		<!-- container -->





		<!-- Modal for portfolio item 1 -->
		<div class="modal fade" id="Modal-1" tabindex="-1" role="dialog"
			aria-labelledby="Modal-label-1">
			<div class="modal-dialog" role="document">
				<div class="modal-content">

					<div class="modal-header">
						<h4 class="modal-title" id="Modal-label-1">Dean & Letter</h4>

						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>

					</div>
					<div class="modal-body">
						<img src="/resources/images/${category}/1.jpg" alt="img01"
							class="img-responsive" />
						<div class="modal-works">
							<span>Branding</span><span>Web Design</span>
						</div>
						<p>Temporibus autem quibusdam et aut officiis debitis aut
							rerum necessitatibus saepe</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>

		<!-- Modal for portfolio item 2 -->
		<div class="modal fade" id="Modal-2" tabindex="-1" role="dialog"
			aria-labelledby="Modal-label-2">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title" id="Modal-label-2">Startup Framework</h4>

						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<img src="/resources/images/${category}/2.jpg" alt="img01"
							class="img-responsive" />
						<div class="modal-works">
							<span>Branding</span><span>Web Design</span>
						</div>
						<p>Temporibus autem quibusdam et aut officiis debitis aut
							rerum necessitatibus saepe</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>

		<!-- Modal for portfolio item 3 -->
		<div class="modal fade" id="Modal-3" tabindex="-1" role="dialog"
			aria-labelledby="Modal-label-3">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title" id="Modal-label-3">Lamp & Velvet</h4>

						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<img src="/resources/images/${category}/3.jpg" alt="img01"
							class="img-responsive" />
						<div class="modal-works">
							<span>Branding</span><span>Web Design</span>
						</div>
						<p>Temporibus autem quibusdam et aut officiis debitis aut
							rerum necessitatibus saepe</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>

		<!-- Modal for portfolio item 4 -->
		<div class="modal fade" id="Modal-4" tabindex="-1" role="dialog"
			aria-labelledby="Modal-label-4">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title" id="Modal-label-4">Smart Name</h4>

						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<img src="/resources/images/${category}/4.jpg" alt="img01"
							class="img-responsive" />
						<div class="modal-works">
							<span>Branding</span><span>Web Design</span>
						</div>
						<p>Temporibus autem quibusdam et aut officiis debitis aut
							rerum necessitatibus saepe</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>

		<!-- Modal for portfolio item 5 -->
		<div class="modal fade" id="Modal-5" tabindex="-1" role="dialog"
			aria-labelledby="Modal-label-5">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title" id="Modal-label-5">Fast People</h4>

						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<img src="/resources/images/${category}/5.jpg" alt="img01"
							class="img-responsive" />
						<div class="modal-works">
							<span>Branding</span><span>Web Design</span>
						</div>
						<p>Temporibus autem quibusdam et aut officiis debitis aut
							rerum necessitatibus saepe</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>


		<!-- Modal for portfolio item 6 -->
		<div class="modal fade" id="Modal-6" tabindex="-1" role="dialog"
			aria-labelledby="Modal-label-6">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title" id="Modal-label-6">Kites & Stars</h4>

						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
					</div>
					<div class="modal-body">
						<img src="/resources/images/${category}/6.jpg" alt="img01"
							class="img-responsive" />
						<div class="modal-works">
							<span>Branding</span><span>Web Design</span>
						</div>
						<p>Temporibus autem quibusdam et aut officiis debitis aut
							rerum necessitatibus saepe</p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>